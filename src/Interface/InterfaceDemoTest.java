package Interface;

public class InterfaceDemoTest {
    public static void main(String[] args) {
        RBIBankService hdfcBankService=new HDFCBankService();
        RBIBankService sbiBankService=new SBIBankService();

        String hdfcStatus=hdfcBankService.transfer("1234","111",100);
        String sbiStatus=sbiBankService.transfer("5678","222",200);

        System.out.println(hdfcStatus);
        System.out.println(sbiStatus);
    }
}
