public class IfAndSwitch {
    public static void main(String[] args){
        System.out.println("start checkNumber");

        checkNumber(0);
        checkNumber(1);

        System.out.println("end checkNumber");

        System.out.println("start switchNumber");
        int val = switchNumber(1);
        int val2 = switchNumber(2);
        int val3 = switchNumber(3);
        System.out.println("should be 123:" + val + val2 + val3);
        System.out.println("end switchNumber");
    }

    public static void checkNumber(int param) {
        if (param > 0) {
            System.out.println("param is greater than 0");
        } else if (param == 0) {
            System.out.println("param is 0");
        }
    }

    public static int switchNumber(int param) {
        switch (param) {
            case 1:
                System.out.println("param is 1");
            case 2:
                System.out.println("param is 2");
            default:
                System.out.println("other");
        }
        return param;
    }
}
