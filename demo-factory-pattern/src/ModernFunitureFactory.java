public class ModernFunitureFactory implements FunitureFactory{
   @Override
   public Chair creatChair() {
    return new ModernChair();
   }

   @Override
   public Sofa creatSofa() {
    return new ModernSofa();
   }
}
