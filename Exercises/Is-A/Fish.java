public Fish {
  private boolean needSalt;

  /**
   * @param animalType - string, which type the animal is
   * @param name - String, name of the animal
   * @param size - int, size of the animal
   * @param needSalt - boolean, if the fish needs salt
  */
  public Fish(String animalType, String name, int size, boolean needSalt) {
    super(animalType, name, size);
    this.needSalt = needSalt;
  }

  /**
   * @return - returns boolean that determines if the fish needs salt water
  */
  public boolean getNeedSalt() {
    return needsSalt;
  }
}
