package pl.raga;



import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;
    private static int count;

    @org.junit.jupiter.api.BeforeAll
    public static void beforeClass(){
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    @org.junit.jupiter.api.BeforeEach
    public void setup(){
        account = new BankAccount("Aga", "Rrrr", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }


    @org.junit.jupiter.api.Test
    void deposit() throws Exception {
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);

    }

    @org.junit.jupiter.api.Test
    void withdraw_branch() throws Exception {
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @org.junit.jupiter.api.Test
    void withdraw_notBranch() throws Exception {

        Exception exception = assertThrows(IllegalArgumentException.class, ()->{
            double balance = account.withdraw(600.00, false);
        });

        String expectedMessage = "cant take more than 500";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @org.junit.jupiter.api.Test
    void getBalance_deposit() throws Exception  {
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() throws Exception  {
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    public void isChecking_true() throws Exception {
       //assertEquals(true, account.isChecking());
        assertTrue(account.isChecking(), "The account is NOT a checking account");
    }

    @org.junit.jupiter.api.AfterAll
    public static void afterClass(){
        System.out.println("This executes after test cases. Count = " + count++);
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown(){
        System.out.println("Count = " + count++);
    }

}