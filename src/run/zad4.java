/*public class zad4 {

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

    static void crc32(String text) {
        int crc = -1;
        for (int i = 0; i<text.length(); i++){
            int codePointAti = Character.codePointAt(text, i);
            int code = codePointAti;
            crc = CRC_TABLE[(code^crc)&0xFF]^(crc>>>8);
        }
        return (-1^crc)>>>0;
    }

}*/