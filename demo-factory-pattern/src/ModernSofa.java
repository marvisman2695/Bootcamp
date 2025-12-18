public interface ModernSofa implements Sofa {
  @Override
  public boolean haslegs() {
    return true;
  }

  @Override
  public boolean sitOn() {
    return true;
  }
}
