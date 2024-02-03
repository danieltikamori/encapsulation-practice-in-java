public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(123456789);
        bankAccount.setBalance(1000);
        bankAccount.ownerName ="John Doe";

        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Balance: " + bankAccount.getBalance());
        System.out.println("Owner Name: " + bankAccount.ownerName);

        bankAccount.setBalance(2000);
        System.out.println("Balance: " + bankAccount.getBalance());

        System.out.println("\n##################################################################\n");

        PersonAge person1 = new PersonAge();
        person1.setPersonName("John");
        person1.setPersonAge(25);

        PersonAge person2 = new PersonAge();
        person2.setPersonName("Jane");
        person2.setPersonAge(30);

        System.out.println(person1.getPersonName() + " is " + person1.getPersonAge() + " years old.");
        person1.isAdult();

        System.out.println(person2.getPersonName() + " is " + person2.getPersonAge() + " years old.");
        person2.isAdult();

        System.out.println("\n##################################################################\n");

        Product product1 = new Product("NVME SSD", 1000);

        System.out.println("Product Name: " + product1.getProductName());
        System.out.println("Product Price: " + product1.getProductPrice());

        product1.calculateFinalPrice(10);
        System.out.println("Final Price after discount: " + product1.getProductPrice());

        System.out.println("\n##################################################################\n");
        Student student1 = new Student("John", 20, 90, 80, 70);
        Student student2 = new Student("Jane", 21, 85, 75, 65);

        System.out.println("Student 1: ");
        System.out.println("Name: " + student1.getStudentName());
        System.out.println("Age: " + student1.getStudentAge());
        System.out.println("Grade 1: " + student1.getStudentGrade1());
        System.out.println("Grade 2: " + student1.getStudentGrade2());
        System.out.println("Grade 3: " + student1.getStudentGrade3());
        System.out.println("Grade 4: " + student1.getStudentGrade4());
        System.out.println("Average Grade: " + student1.calculateAverageGrade());
        System.out.println();

        System.out.println("Student 2: ");
        System.out.println("Name: " + student2.getStudentName());
        System.out.println("Age: " + student2.getStudentAge());
        System.out.println("Grade 1: " + student2.getStudentGrade1());
        System.out.println("Grade 2: " + student2.getStudentGrade2());
        System.out.println("Grade 3: " + student2.getStudentGrade3());
        System.out.println("Grade 4: " + student2.getStudentGrade4());
        System.out.println("Average Grade: " + student2.calculateAverageGrade());

        System.out.println("\n##################################################################\n");

        Book book1 = new Book();
        book1.setBookTitle("The Great Gatsby");
        book1.setBookAuthor("F. Scott Fitzgerald");
        book1.setBookPages(218);

        Book book2 = new Book();
        book2.setBookTitle("To Kill a Mockingbird");
        book2.setBookAuthor("Harper Lee");

        book1.showBookDetails();
        book2.showBookDetails();

    }
}
