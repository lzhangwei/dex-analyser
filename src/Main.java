import java.io.*;

public class Main {

    public static void main(String[] args) {

        DexHeader dexHeader = new DexHeader();
        FileInputStream inputStream = null;
        byte buffer1[] = new byte[1];
        byte buffer4[] = new byte[4];

        try {
            inputStream = new FileInputStream("resources/test.dex");
            dexHeader.readHeader(inputStream);

            inputStream.skip(8);//跳过DataSize&DataOff

            StringTable stringTable = new StringTable();
            stringTable.createStringListRef(inputStream, dexHeader.getStringTable().getSize());

            TypeTable typeTable = new TypeTable();
            typeTable.createTypeStringRef(inputStream, dexHeader.getTypeTable().getSize());

            System.out.println("Dex文件中字符串个数为：" + dexHeader.getStringTable().getSize());
            System.out.println("字符串依次是：");
            for (int i = 0; i < dexHeader.getStringTable().getSize(); i++) {
                inputStream = new FileInputStream("resources/test.dex");
                inputStream.skip(stringTable.getStringRef(i));
                inputStream.read(buffer1);
                int size= buffer1[0];

                byte buffer[] = new byte[size];
                inputStream.read(buffer, 0, size);
                stringTable.addStringList(new String(buffer));
                System.out.println("     字符串"+(i+1)+":" + new String(buffer));
            }

            System.out.println("Dex文件中类型个数为：" + dexHeader.getTypeTable().getSize());
            System.out.println("类型依次是：");
            for (int i = 0; i < dexHeader.getTypeTable().getSize(); i++) {
                int ref = typeTable.getTypeStringRef(i);
                typeTable.addTypeList(stringTable.getStringList().get(ref-1));
                System.out.println("     类型"+(i+1)+":" + stringTable.getStringList().get(ref-1));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
