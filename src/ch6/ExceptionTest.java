package ch6;

/**
 * @author lucy
 */
public class ExceptionTest {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("����������");
            return;
        }
        try {
            int num = Integer.parseInt(args[0]);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.err.println("����" + args[0] + "������Ч�����֣�����������");
            throw e;
        } finally {
            System.out.println("111");
        }
    }
}
