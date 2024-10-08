package modul4.FinalTask;

public class Product {

  private final String name;
  private final Double price;

  public Product(String name, Double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public Double getPrice() {
    return price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Product product = (Product) o;

    if (!name.equals(product.name)) {
      return false;
    }
    return price.equals(product.price);
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + price.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Product{" +
        "name='" + name + '\'' +
        ", price=" + price +
        '}';
  }

}
