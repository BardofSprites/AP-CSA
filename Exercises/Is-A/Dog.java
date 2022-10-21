public Dog {
  private boolean trained;

  /**
   * @param animalType - the type of animal
   * @param name - name of animal
   * @param size - int, size of animal
   * @param trained - boolean, is the animal trained
   */

  public Dog(String animalType, String name, int size, boolean trained) {
    super(animalType, animalName, animalAge);
    this.trained = trained;
  }
  
  public boolean getTrained() {
    return trained;
  }

  public void setTrained(boolean trained) {
    this.trained = trained;
  }
}
