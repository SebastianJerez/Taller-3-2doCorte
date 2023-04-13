/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Cinema;

import java.awt.Robot;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author LabSispc18
 */
public class Main {
    
    private static ArrayList<Movie>myMovies= new ArrayList<>();
    private static ArrayList<Employee>myEmployees = new ArrayList<>();
    private static ArrayList<Client>myClients = new ArrayList<>();
    private static ArrayList<Function>myFunctions = new ArrayList<>();
    private static ArrayList<Room>myRooms = new ArrayList<>();
    private static ArrayList<Sales>mySales = new ArrayList<>();
    private static ArrayList<SnackbarProduct>myProducts = new ArrayList<>();
    private static ArrayList<SnackbarSales>mySnackSales = new ArrayList<>();
    //Variables para fechas
    private static Calendar calendar = Calendar.getInstance();
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private static int globalRoomNumber = 0;
    
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
                            addMovie(input);
                            Thread.sleep(1000);
                            System.out.println("");
                            break;
                        }
                        case 2:{
                            if(myMovies.isEmpty()){
                                System.out.println("No hay peliculas agregadas.");
                            }else{
                                readMovies();
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
                case 4:{
                    switch(subMenu){
                        case 1:{
                            if(myMovies.isEmpty()||myRooms.isEmpty()){
                                System.out.println("Se requiere crear primero Peliculas y Salas para crear Funciones.");
                                break;
                            }
                            addFunctions(input);
                            Thread.sleep(1000);
                            System.out.println("");
                            break;
                        }
                        case 2:{
                            if(myFunctions.isEmpty()){
                                System.out.println("No hay clientes agregados.");
                            }else{
                                readFunctions();
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
                            addRoom(input);
                            Thread.sleep(1000);
                            System.out.println("");
                            break;
                        }
                        case 2:{
                            if(myRooms.isEmpty()){
                                System.out.println("No hay salas agregadas.");
                            }else{
                                readRooms();
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
                    switch(subMenu){
                        case 1:{
                            if(myFunctions.isEmpty()||myClients.isEmpty()){
                                System.out.println("Se requiere crear primero funciones y clientes para crear ventas.");
                                break;
                            }
                            addSales(input);
                            Thread.sleep(1000);
                            System.out.println("");
                            break;
                        }
                        case 2:{
                            if(mySales.isEmpty()){
                                System.out.println("No hay clientes agregados.");
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
                case 7:{
                    switch(subMenu){
                        case 1:{
                            addSnackProduct(input);
                            Thread.sleep(1000);
                            System.out.println("");
                            break;
                        }
                        case 2:{
                            if(myProducts.isEmpty()){
                                System.out.println("No hay clientes agregados.");
                            }else{
                                readSnackProducts();
                            }
                            System.out.println("----Presione ENTER para continuar----");
                            input.next();
                            System.out.println("");
                            break;
                        }
                    }
                    break;
                }
                case 8:{
                    switch(subMenu){
                        case 1:{
                            if(myProducts.isEmpty()||myClients.isEmpty()){
                                System.out.println("Se requiere crear primero produtos de Confiteria y Clientes para crear ventas de confiteria");
                                break;
                            }
                            addSnackSales(input);
                            Thread.sleep(1000);
                            System.out.println("");
                            break;
                        }
                        case 2:{
                            if(mySnackSales.isEmpty()){
                                System.out.println("No hay clientes agregados.");
                            }else{
                                readSnackSales();
                            }
                            System.out.println("----Presione ENTER para continuar----");
                            input.next();
                            System.out.println("");
                            break;
                        }
                    }
                    break;
                }
                case 9:{
                    System.exit(0);
                    break;
                }
            }
        }while(menu!=9);
    }
    //************************************************************************************************************************************
    public static int Menu(Scanner input){
        System.out.println("Escoja una opcion:");
        System.out.println("1. Peliculas ");
        System.out.println("2. Empleados");
        System.out.println("3. Clientes");
        System.out.println("4. Funciones");
        System.out.println("5. Salas");
        System.out.println("6. Ventas de Tickets");
        System.out.println("7. Productos de Confiteria");
        System.out.println("8. Ventas de Confiteria");
        System.out.println("9. Salir");
        int value=1;
        do{
            value = input.nextInt();
            if(value<1||value>9){
                System.out.println("Opcion no valida, intente de nuevo");
            }
        }while(value<1||value>9);
        return value;
    }
    //************************************************************************************************************************************
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
    //************************************************************************************************************************************
    public static void addMovie(Scanner input){
        System.out.println("Ingrese el nombre de la pelicula:");
        String name = input.next();
        System.out.println("Ingrese la fecha de lanzamiento (yyyy-MM-dd):");
        String date = input.next();
        System.out.println("Ingrese la duracion de la pelicula (Solo minutos): ");
        int duration = input.nextInt();
        System.out.println("Ingrese el genero de la pelicula:");
        String gender = input.next();
        System.out.println("Ingrese a que audiencia va dirigida la pelicula:");
        String audience = input.next();
        
        Movie movie = new Movie(name,date,duration,gender,audience);
        myMovies.add(movie);
        System.out.println("Pelicula agregada correctamente.");
    }
    
    public static void readMovies(){
        for(Movie e:myMovies){
            System.out.println(e.toString());
        }
    }
    //************************************************************************************************************************************
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
        System.out.println("Ingrese el area asignada al empleado:");
        String area = input.next();
        System.out.println("Ingrese la hora de entrada del empleado:");
        String entry = input.next();
        System.out.println("Ingrese la hora de salida del empleado:");
        String departure = input.next();
        
        Employee employee = new Employee(role,salary,area,entry,departure,name,id,date);
        myEmployees.add(employee);
        System.out.println("Empleado agregado correctamente");
    }
    
    public static void readEmployees(){
        for(Employee e:myEmployees){
            System.out.println(e.toString());
        }
    }
    //************************************************************************************************************************************
    public static void addClient(Scanner input){
        System.out.println("Ingrese el nombre del cliente:");
        String name = input.next();
        System.out.println("Ingrese el ID del cliente:");
        String id = input.next();
        System.out.println("Ingrese la fecha de nacimiento del cliente:");
        String date = input.next();
        System.out.println("El cliente tiene membresia? (1=Si , 0=No)");
        int member = 0; 
        do{
            member = input.nextInt();
            if(member<0||member>1){
                System.out.println("Valor no valido");
            }
        }while(member<0||member>1);
        boolean hasMember = (member==1);
        
        Client client = new Client(hasMember,name,id,date);
        myClients.add(client);
        System.out.println("Cliente agregado correctamente");
    }
    
    public static void readClients(){
        for(Client e:myClients){
            System.out.println(e.toString());
        }
    }
    //************************************************************************************************************************************
    public static void addRoom(Scanner input){
        System.out.println("Ingrese la capacidad de la sala:");
        int capacity = input.nextInt();
        System.out.println("Ingrese que tipo de sala es (Premium, XD, etc):");
        String type = input.next();
        globalRoomNumber++;
        
        Room room = new Room(globalRoomNumber,capacity,type);
        myRooms.add(room);
        System.out.println("Sala agregada correctamente");
    }
    
    public static void readRooms(){
        for(Room e:myRooms){
            System.out.println(e.toString());
        }
    }
    //************************************************************************************************************************************
    public static void addSnackProduct(Scanner input){
        System.out.println("Ingrese el nombre del producto de cafeteria:");
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
        String code = input.next();
        
        SnackbarProduct snackbarProduct = new SnackbarProduct(name,price,code);
        myProducts.add(snackbarProduct);
        System.out.println("Producto agregado correctamente.");
    }
    
    public static void readSnackProducts(){
        for(SnackbarProduct e:myProducts){
            System.out.println(e.toString());
        }
    }
    //************************************************************************************************************************************
    public static void addSnackSales(Scanner input){
        double productPrice=0;
        boolean productExist=false;
        boolean clientExist=false;
        SnackbarProduct product = new SnackbarProduct();
        Client client = new Client();
        
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
        for(SnackbarProduct e:myProducts){
            System.out.println("- "+e.getName());
        }
        System.out.println("Ingrese el nombre del producto");
        do{
            String productName = input.next();
            for(SnackbarProduct e:myProducts){
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
        System.out.println("Cuanta cantidad desea comprar?");
        int quantity;
        do{
            quantity = input.nextInt();
            if(quantity<0){
                System.out.println("La cantidad debe ser mayor a 0");
            }
        }while(quantity<0);
        
        double total = productPrice*quantity;
        String purchaseDate = dateFormat.format(calendar.getTime());
        
        SnackbarSales snackbarSale = new SnackbarSales(product,quantity,total,client,purchaseDate);
        mySnackSales.add(snackbarSale);
        System.out.println("Venta registrada correctamente");
    }
    
    public static void readSnackSales(){
        for(SnackbarSales e:mySnackSales){
            System.out.println(e.toString());
        }
    }
    //************************************************************************************************************************************
    public static void addFunctions(Scanner input){
        boolean movieExist=false;
        Movie movie = new Movie();
        
        System.out.println("Ingrese el nombre de la pelicula:");
        for(Movie e:myMovies){
            System.out.println("-"+e.getName());
        }
        System.out.println("Ingrese el nombre de la pelicula:");
        String movieName;
        do{
            movieName = input.next();
            for(Movie e:myMovies){
                if(e.getName().equals(movieName)){
                    movieExist=true;
                    movie = e;
                    break;
                }
            }
            if(!movieExist){
                System.out.println("La pelicula ingresada no existe o no coincide, intente de nuevo");
            }
        }while(!movieExist);
        
        System.out.println("Ingrese la sala en la que se programara la pelicula:");
        for(Room e:myRooms){
            System.out.println("- "+e.getRoomNumber()+" ");
        }
        int roomNumber;
        boolean roomExist=false;
        do{
            roomNumber = input.nextInt();
            for(Room e:myRooms){
                if(e.getRoomNumber()==roomNumber){
                    roomExist=true;
                    break;
                }
            }
            if(!roomExist){
                System.out.println("La sala no existe o no coincide, intente de nuevo.");
            }
        }while(!roomExist);
        System.out.println("Ingrese el horario de la funcion:");
        System.out.println("Ingrese la hora a la que empieza (Solo hora):");
        int hourBegin = input.nextInt();
        System.out.println("Ingrese el minuto de la hora a la que empieza:");
        int minuteBegin = input.nextInt();
        System.out.println("Ingrese el precio de la boleta para esta funcion:");
        double price;
        do{
            price = input.nextDouble();
            if(price<0){
                System.out.println("El precio debe ser mayor a 0");
            }
        }while(price<0);
        
        Function function = new Function(movie,roomNumber,hourBegin,minuteBegin,price);
        myFunctions.add(function);
        System.out.println("Funcion creada correctamente");
    }
    
    public static void readFunctions(){
        for(Function e:myFunctions){
            System.out.println(e.toString());
        }
    }
    //************************************************************************************************************************************
    public static void addSales(Scanner input){
        Client client = new Client();
        boolean movieExist=false;
        boolean clientExist=false;
        String movieName;
        
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
        
        System.out.println("Ingrese la pelicula que quiere ver:");
        for(Movie e:myMovies){
            for(Function f:myFunctions){
                if(e.getName().equals(f.getMyMovie().getName())){
                    System.out.println("- "+e.getName());
                    break;
                }
            }
        }
        do{
            movieName = input.next();
            for(Movie e:myMovies){
                if(e.getName().equals(movieName)){
                    movieExist=true;
                    break;
                }
            }
            if(!movieExist){
                System.out.println("La pelicula ingresada no existe o no tiene funcion asignada, intente de nuevo");
            }
        }while(!movieExist);
        
        System.out.println("En que horario desea verla?");
        int i=0;
        for(Function e:myFunctions){
            if(movieName.equals(e.getMyMovie().getName())){
                System.out.println(i+"= "+e.getHourBegin()+":"+e.getMinuteBegin());
            }            
            i++;
        }
        int select = input.nextInt();
        Function function = myFunctions.get(select);
        
        System.out.println("Cuantos tickets desea comprar?");
        int tickets;
        do{
            tickets = input.nextInt();
            if(tickets<0){
                System.out.println("Debe comprar por lo menos un ticket");
            }
        }while(tickets<0);
        
        double total = tickets*function.getTicketPrice();
        String purchaseDate = dateFormat.format(calendar.getTime());
        
        Sales sale = new Sales(client,function,tickets,total,purchaseDate);
        mySales.add(sale);
        System.out.println("Tickets comprados exitosamente");
    }
    
    public static void readSales(){
        for(Sales e:mySales){
            System.out.println(e.toString());
        }
    }
}
