package madenipara;

    enum Mp {
        KURUS(1), BESKURUS(5), ONKURUS(10), YİRMİBESKURUS(25);//madeni paraları tanıttık
        Mp(int value) { this.value = value; }
        private final int value;//sabit ekledik
        public int value() { return value; }
    }
    class Test {
        public static void main(String[] args) {
            for (Mp c : Mp.values())//döngüye soktuk
                System.out.println(c + "\t\t" +
                                   c.value() + "\t" + renk(c));
        }
        private enum mprenk { BAKIR, NİKEL, GÜMÜŞ }//paraların maddelerini tanımladık
        private static mprenk renk(Mp c) {
            switch(c) {//madeni paraların maddelerini belirttik
                case KURUS:
                    return mprenk.BAKIR;
                case BESKURUS:
                    return mprenk.NİKEL;
                case ONKURUS: case YİRMİBESKURUS:
                    return mprenk.GÜMÜŞ;
                default:
                    System.out.println("Bilinmeyen madeni para::"+c);
            }
            return null;
        }}