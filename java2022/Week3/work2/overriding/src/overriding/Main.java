package overriding;

public class Main {
	public static void main(String[] args) {
        BaseCreditManager[] creditManagers = new BaseCreditManager[]{new TeacherCreditManager(), new FarmCreditManager(), new StudentCreditManager()};
        
        for (BaseCreditManager creditManager : creditManagers) {
            System.out.println(creditManager.getClass().getSimpleName()+": "+creditManager.calculate(2500));
        }
    }

}
