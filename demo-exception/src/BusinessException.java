// if a class extende=ing Expcetion / RuntimeException, you can "throw" this exception object


//! "checked Exception -> a class extend Exception
// ! "Unchecked Exception ->a class extends RuntimeException 

public class BusinessException extends RuntimeException { 
  private int code;

  public BusinessException(SysError sysError) {
    super(sysError.getMessage());
  }

  public static void main(String[] args) {
    new RuntimeException("abc"); 

    throw new BusinessException(SysError.CUSTOMER_NOT_FOUND);

  }
}
