/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.udes.taller_3_2c_segunda_parte;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Main {

    private static ArrayList<Manager>myManagers= new ArrayList<>();
    private static ArrayList<Employee>myEmployees = new ArrayList<>();
    private static ArrayList<Client>myClients = new ArrayList<>();
    private static ArrayList<Product>myProducts = new ArrayList<>();
    private static ArrayList<Sales>mySales = new ArrayList<>();
    private static Calendar calendar = Calendar.getInstance();
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        
        int menu=0;
        int subMenu=0;
        
        do{
            menu = Menu(input);
            subMenu = subMenu(input);
            switch(menu){
                case 1:{
                    switch(subMenu){
                        case 1:{
                            addProduct(input);
                            Thread.sleep(1000);
                            System.out.println("");
                            break;
                        }
                        case 2:{
                            if(myProducts.isEmpty()){
                                System.out.println("No hay productos agregados.");
                            }else{
                                readProducts();
                            }
                            System.out.println("----Presione ENTER para continuar----");
                            input.next();
                            System.out.println("");
                            break;
                        }
                    }
                    break;
                }
                case 2:{
                    switch(subMenu){
                        case 1:{
                            addEmployee(input);
                            Thread.sleep(1000);
                            System.out.println("");
                            break;
                        }
                        case 2:{
                            if(myEmployees.isEmpty()){
                                System.out.println("No hay empleados agregados.");
                            }else{
                                readEmployees();
                            }
                            System.out.println("----Presione ENTER para continuar----");
                            input.next();
                            System.out.println("");
                            break;
                        }
                    }
                    break;
                }
                case 3:{
                    switch(subMenu){
                        case 1:{
                            addManager(input);
                            Thread.sleep(1000);
                            System.out.println("");
                            break;
                        }
                        case 2:{
                            if(myManagers.isEmpty()){
                                System.out.println("No hay administradores agregados.");
                            }else{
                                readManager();
                            }
                            System.out.println("----Presione ENTER para continuar----");
                            input.next();
                            System.out.println("");
                            break;
                        }
                    }
                    break;
                }
                case 4:{
                    switch(subMenu){
                        case 1:{
                            addClient(input);
                            Thread.sleep(1000);
                            System.out.println("");
                            break;
                        }
                        case 2:{
                            if(myClients.isEmpty()){
                                System.out.println("No hay clientes agregados.");
                            }else{
                                readClients();
                            }
                            System.out.println("----Presione ENTER para continuar----");
                            input.next();
                            System.out.println("");
                            break;
                        }
                    }
                    break;
                }
                case 5:{
                    switch(subMenu){
                        case 1:{
                            if(myClients.isEmpty()||myProducts.isEmpty()){
                                System.out.println("Se requieren clientes y productos para hacer una venta");
                                break;
                            }
                            addSales(input);
                            Thread.sleep(1000);
                            System.out.println("");
                            break;
                        }
                        case 2:{
                            if(mySales.isEmpty()){
                                System.out.println("No existen ventas realizadas.");
                            }else{
                                readSales();
                            }
                            System.out.println("----Presione ENTER para continuar----");
                            input.next();
                            System.out.println("");
                            break;
                        }
                    }
                    break;
                }
                case 6:{
                    System.exit(0);
                    break;
                }
            }
        }while(menu!=6);
    }
    //*****************************************************************************************************************************************
    public static int Menu(Scanner input){
        System.out.println("Escoja una opcion:");
        System.out.println("1. Productos ");
        System.out.println("2. Empleados");
        System.out.println("3. Administradores");
        System.out.println("4. Clientes");
        System.out.println("5. Ventas");
        System.out.println("6. Salir");
        int value=1;
        do{
            value = input.nextInt();
            if(value<1||value>6){
                System.out.println("Opcion no valida, intente de nuevo");
            }
        }while(value<1||value>6);
        return value;
    }
    //*****************************************************************************************************************************************
    public static int subMenu(Scanner input){
        System.out.println("Selecciona que accion hacer:");
        System.out.println("1. Crear");
        System.out.println("2. Listar");
        int value=1;
        do{
            value = input.nextInt();
            if(value<1||value>2){
                System.out.println("Opcion no valida, intente de nuevo");
            }
        }while(value<1||value>2);
        return value;
    }
    //*****************************************************************************************************************************************
    public static void addEmployee(Scanner input){
        System.out.println("Ingrese el nombre del empleado:");
        String name = input.next();
        System.out.println("Ingrese el Id del empleado:");
        String id = input.next();
        System.out.println("Ingrese la fecha de nacimiento del empleado:");
        String date = input.next();
        System.out.println("Ingrese el rol del empleado:");
        String role = input.next();
        System.out.println("Ingrese el salario del empleado");
        double salary = input.nextDouble();
        
        Employee employee = new Employee(role,salary,name,id,date);
        myEmployees.add(employee);
        System.out.println("Empleado agregado correctamente");
    }
    
    public static void readEmployees(){
        for(Employee e:myEmployees){
            System.out.println(e.toString());
        }
    }
    //*********************************************************************************************************************************************
    public static void addClient(Scanner input){
        System.out.println("Ingrese el nombre del cliente:");
        String name = input.next();
        System.out.println("Ingrese el ID del cliente:");
        String id = input.next();
        System.out.println("Ingrese la fecha de nacimiento del cliente:");
        String date = input.next();
        System.out.println("El cliente es afiliado? (1=Si , 0=No)");
        int affiliate = 0; 
        do{
            affiliate = input.nextInt();
            if(affiliate<0||affiliate>1){
                System.out.println("Valor no valido");
            }
        }while(affiliate<0||affiliate>1);
        boolean isAffiliate = (affiliate==1);
        
        Client client = new Client(isAffiliate,name,id,date);
        myClients.add(client);
        System.out.println("Cliente agregado correctamente");
    }
    
    public static void readClients(){
        for(Client e:myClients){
            System.out.println(e.toString());
        }
    }
    //*************************************************************************************************************************************************
    public static void addManager(Scanner input){
        System.out.println("Ingrese el nombre del administrador:");
        String name = input.next();
        System.out.println("Ingrese el ID del cliente:");
        String id = input.next();
        System.out.println("Ingrese la fecha de nacimiento del cliente:");
        String date = input.next();
        System.out.println("Ingrese el rol del empleado:");
        String role = input.next();
        System.out.println("Ingrese el salario del empleado:");
        double salary = input.nextDouble();
        System.out.println("Ingrese el area al que se asigna el administrador:");
        String area = input.next();
        
        Manager manager = new Manager(role,salary,area,name,id,date);
        myManagers.add(manager);
        System.out.println("Administrador agregado correctamente");
    }
    
    public static void readManager(){
        for(Manager e:myManagers){
            System.out.println(e.toString());
        }
    }
    //***************************************************************************************************************************************************
    public static void addProduct(Scanner input){
        System.out.println("Ingrese el nombre del producto:");
        String name = input.next();
        System.out.println("Ingrese el precio el producto:");
        double price;
        do{
            price = input.nextDouble();
            if(price<0){
                System.out.println("Precio no valido");
            }
        }while(price<0);
        System.out.println("Ingrese el codigo del producto:");
        int code = input.nextInt();
        System.out.println("Ingrese la fecha de vencimiento del producto:");
        String dueDate = input.next();
        
        Product product = new Product(code,price,name,dueDate);
        myProducts.add(product);
        System.out.println("Producto agregado correctamente.");
    }
    
    public static void readProducts(){
        for(Product e:myProducts){
            System.out.println(e.toString());
        }
    }
    //**************************************************************************************************************************************************
    public static void addSales(Scanner input){
        Client client = new Client();
        Product product = new Product();
        boolean clientExist = false;
        boolean productExist = false;
        double productPrice = 0;
        
        
        System.out.println("Ingrese el nombre del cliente:");
        do{
            String clientName = input.next();
            for(Client e:myClients){
                if(e.getName().equals(clientName)){
                    clientExist=true;
                    client = e;
                    break;
                }
            }
            if(!clientExist){
                System.out.println("El cliente ingresado no existe o no coincide, intente de nuevo");
            }
        }while(!clientExist);
        
        System.out.println("Ingrese el nombre del producto a vender");
        for(Product e:myProducts){
            System.out.println("- "+e.getName());
        }
        System.out.println("Ingrese el nombre del producto");
        do{
            String productName = input.next();
            for(Product e:myProducts){
                if(e.getName().equals(productName)){
                    productPrice = e.getPrice();
                    product = e;
                    productExist = true;
                    break;
                }
            }
            if(!productExist){
                System.out.println("El producto ingresado no existe o no coincide, intente de nuevo.");
            }
        }while(!productExist);
        
        System.out.println("Cuantas unidades desea comprar?");
        int quantity = input.nextInt();
        double total = productPrice*quantity;
        System.out.println("Su total es de "+total+" pesos");
        String purchaseDate = dateFormat.format(calendar.getTime());
        
        Sales sale = new Sales(client,product,total,purchaseDate);
        mySales.add(sale);
        System.out.println("Compra realizada correctamente");
    }
    
    public static void readSales(){
        for(Sales e:mySales){
            System.out.println(e.toString());
        }
    }
}
