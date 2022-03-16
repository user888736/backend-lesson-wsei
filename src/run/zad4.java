public class zad4 {

    public static void main(String[] args) {

        int[] CRC_TABLE;
        CRC_TABLE = new int[256];

        for (int i=0; i<256; i++){
            int code =i;
            for(int j =0; j<8; j++){
                code = (code & 0x01 ? 0xEDB88320 ^ (code >>> 1) : (code >>>1));
            }
            CRC_TABLE[i] = code;
        }
    }



}