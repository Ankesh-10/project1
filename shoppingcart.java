/*Implement a ShoppingCart class that contains an inner class Item.
a) The Item class should have fields like itemName, quantity, and price.
b) The ShoppingCart class should provide methods to add items, calculate the total price,
and display the cart contents.*/
import java.util.Scanner;
        class shoppingcart{
            item[] cart;
            int count;
            shoppingcart(int max){
                cart=new item[max];
                count=0;
            }
            void addItem(String n,int q,double p){
                if(count<cart.length){
                    cart[count]=new item(n,q,p);
                    count++;
                }else{
                    System.out.println("Cart is full");
                }
            }
            double calculateTotal(){
                double total=0;
                for(int i=0;i<count;i++){
                    total+=cart[i].price*cart[i].quantity;
                }
                return total;
            }
            void displayCart(){
                System.out.println("Items in the cart:");
                for(int i=0;i<count;i++){
                    System.out.println(cart[i].itemName+" "+cart[i].quantity+" "+cart[i].price);
                }
                System.out.println("Total price: "+calculateTotal());
            }
            class item{
        String itemName;
        int quantity;
        double price;
        item(String n,int q, double p){
            itemName=n;
            quantity=q;
            price=p;    
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of items in the cart:");
        int max=sc.nextInt();
        shoppingcart cart=new shoppingcart(max);
        System.out.println("Enter item name, quantity and price:");
        String name=sc.next(); // sc.nextLine(); // Consume the newline character left by nextInt()
        int quantity=sc.nextInt();
        double price=sc.nextDouble();
        cart.addItem(name,quantity,price);
        cart.addItem("apple",2,3.5);
        cart.addItem("banana",3,1.5);
        cart.addItem("orange",4,2.0);
        cart.displayCart();
    }
       
}