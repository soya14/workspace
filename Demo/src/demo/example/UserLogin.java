package demo.example;
import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ϥΪ̦W�١G");
        String username = scanner.next();
        
        System.out.print("�ϥΪ̱K�X�G");
        String password = scanner.next();

        if("caterpillar".equals(username) 
                  && "1975".equals(password)) {

            System.out.println("���K��T�b���I");
        }
        else {
            System.out.println(username + 
                    " �z�n�A��J���n�J��Ʀ��~�A�Э��s��J�I");
        }

	}

}
