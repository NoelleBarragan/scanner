import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Average each row of ten test scores
 */
public class ScannerReadCSVFile
{
    public void run() throws FileNotFoundException {
        // Mr. Jaffe's code to read data from a file
        // Instantiate a File object
        File dataFile = new File("TestScoresByClass.csv");

        // Instantiate a Scanner object that uses the file
        Scanner scanner = new Scanner(dataFile);

        // Set the delimiter as a new-line character so we can read the
        // data one line at a time
        scanner.useDelimiter("\n");
        int i = 0;

        // Continue while there's still data in the file to be read
        while (scanner.hasNext()) {
            // Read the next line of the file
            String line = scanner.nextLine();
            
            //System.out.println(line);
            Scanner score = new Scanner(line).useDelimiter(",");
        


            Scanner classNmbr = new Scanner(line).useDelimiter(",");
            String cn = classNmbr.next();
            System.out.println(cn);
            while (score.hasNextInt() && i <= 10){
                if (i == 1) {
                    i++;
                } 
                else {
                    
                    double total = score.nextInt();
                    total = total + score.nextInt();
                    
                    
                    
                    
                    
                    
                    //int scores = score.nextInt();
                    //scores += score.nextInt();
                    //System.out.print(scores);
                    System.out.println(i);
                    i++;
                    
               }

            }
            i = 0;
            int meanie = (int)(total/10.0);
            System.out.print(meanie);
            System.out.println(cn +":" + meanie);
        }
    }

    public static void main (String[] args) {
        try {
            ScannerReadCSVFile srCsv = new ScannerReadCSVFile();
            srCsv.run();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println("There's an error someplace. Try using the debugger to find it!");

        }
    }
}
