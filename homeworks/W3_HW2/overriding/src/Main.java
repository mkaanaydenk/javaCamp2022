public class Main {
    public static void main(String[] args) {

        BaseCreditManager[] creditManagers = new BaseCreditManager[]{new FarmerCreditManager(), new TeacherCreditManager(), new StudentCreditManager()};

        for (BaseCreditManager creditManager : creditManagers) {
            System.out.println(creditManager.hesapla(6.000));
        }
    }
}
