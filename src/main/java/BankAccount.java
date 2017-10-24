
/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * checking account.
         */
        CHECKINGS,
        /**
         * savings account.
         */
        SAVINGS,
        /**
         * student account.
         */
        STUDENT,
        /**
         * workplace account.
         */
        WORKPLACE
    }

    /** variable that represents account number.
     *
     */
    private int accountNumber;

    /**
     * variable that represents account type.
     */
    private BankAccountType accountType;

    /**
     * variable that represents account balance.
     */
    private double accountBalance;

    /**
     * string that represents owner name.
     */
    private String ownerName;

    /**
     * variable that represents interest rate.
     */
    private double interestRate;

    /**
     * variable that represents interest earned.
     */
    private double interestEarned;

    /**
     * account number threshold.
     */
    public static final int ACCOUNT_NUM_THRES = 10000;

    /**
     * constructor for bank account.
     * @param name a string
     * @param accountCategory a bankAccountType
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;

    }



    /**
     * method that sets account number.
     * @return accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * variable that sets account number.
     */
    public void setAccountNumber() {
        this.accountNumber = (int) Math.random() * ACCOUNT_NUM_THRES + 1;
    }

    /**
     * method that returns account type.
     * @return accountType
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * method that sets account type.
     * @param accountTy a BankAccountType
     */
    public void setAccountType(final BankAccountType accountTy) {
        this.accountType = accountTy;
    }

    /**
     * method that returns account balance.
     * @return accountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * method that sets account balance.
     * @param accountBal a double
     */
    public void setAccountBalance(final double accountBal) {
        this.accountBalance = accountBal;
    }

    /**
     * method that returns owner name.
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * method that sets owner name.
     * @param owner a string
     */
    public void setOwnerName(final String owner) {
        this.ownerName = owner;
    }

    /**
     * method that returns interest rate.
     * @return interestRate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * method that sets interest rate.
     * @param interestR a double
     */
    public void setInterestRate(final double interestR) {
        this.interestRate = interestR;
    }

    /**
     * method that returns interest earned.
     * @return interestEarned
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * method that sets interest earned.
     * @param interestE a double
     */
    public void setInterestEarned(final double interestE) {
        this.interestEarned = interestE;
    }

}
