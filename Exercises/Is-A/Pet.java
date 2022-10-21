class Pet {
  private String animalType;
  private String name;
  private int size;

  /** 
   * @param animalType - String animalType
   * @param name - String name
   * @param size - int size
   */
  public Pet(String animalType, String name, int size) {
    this.animalType = animalType;
    this.name = name;
    this.size = size;
  }

  /**
   * @param animalType - type of animal that you have
   * Sets animalType to param
  */
  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }
  
  /**
   * @param - the animal's name
   * Sets animals name to param
  */
  public String setName() {
    this.name = name;
  }
  

  /**
   * @return - returns the animal's size
  */
  public int getSize() {
    return size;
  }
}
