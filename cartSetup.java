    public class cartSetup {

    private String items;
    private double price;

        public cartSetup(String items,  double price) {
            this.items = items;
            this.price = price;


        }
        public String getItems() {
            return items;
        }
        public double getPrice() {
            return price;
        }
        public void setItems(String items) {
            this.items = items;
        }

        public void setPrice(double price) {
            this.price = price;
        }


    }

