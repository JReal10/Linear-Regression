import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {

  private String filename = "C:\\Users\\Jamie\\Documents\\ExamResults\\ExamResults.csv";
  private ArrayList<Integer> CSE102List = new ArrayList<>(), CSE103List = new ArrayList<>(),CSE104List = new ArrayList<>(),CSE105List = new ArrayList<>(),CSE106List = new ArrayList<>(), CSE107List = new ArrayList<>(),CSE108List = new ArrayList<>(),CSE109List = new ArrayList<>(),CSE116List= new ArrayList<>(),CSE117List = new ArrayList<>();
  private ArrayList<Integer> CSE110List = new ArrayList<>(), CSE111List = new ArrayList<>(),CSE112List = new ArrayList<>(),CSE113List = new ArrayList<>(),CSE114List = new ArrayList<>(), CSE115List = new ArrayList<>(),CSE118List = new ArrayList<>(), CSE119List = new ArrayList<>(),CSE120List = new ArrayList<>(),CSE101List = new ArrayList<>();
  private ArrayList<Integer> StudentIdList = new ArrayList<>();
  private ArrayList<Double> AverageModuleMark = new ArrayList<>();


  public void ReadCSVFile()
  {
      String line = "";

      try{
          BufferedReader br = new BufferedReader(new FileReader(filename));

          while((line = br.readLine()) != null)
          {
              String[] values = line.split(",");
              if(values[0].length() < 3 ) {

                  StudentIdList.add(Integer.parseInt(values[0]));

                  if(values[1].length() == 4 )
                      CSE101List.add(Integer.parseInt("0"));
                  else
                      CSE101List.add(Integer.parseInt(values[1]));

                  if(values[2].length() == 4 )
                      CSE102List.add(Integer.parseInt("0"));
                  else
                      CSE102List.add(Integer.parseInt(values[2]));

                  if(values[3].length() == 4 )
                      CSE103List.add(Integer.parseInt("0"));
                  else
                      CSE103List.add(Integer.parseInt(values[3]));

                  if(values[4].length() == 4 )
                      CSE104List.add(Integer.parseInt("0"));
                  else
                      CSE104List.add(Integer.parseInt(values[4]));

                  if(values[5].length() == 4 )
                      CSE105List.add(Integer.parseInt("0"));
                  else
                      CSE105List.add(Integer.parseInt(values[5]));

                  if(values[6].length() == 4 )
                      CSE106List.add(Integer.parseInt("0"));
                  else
                      CSE106List.add(Integer.parseInt(values[6]));

                  if(values[7].length() == 4 )
                      CSE107List.add(Integer.parseInt("0"));
                  else
                      CSE107List.add(Integer.parseInt(values[7]));

                  if(values[8].length() == 4 )
                      CSE108List.add(Integer.parseInt("0"));
                  else
                      CSE108List.add(Integer.parseInt(values[8]));

                  if(values[9].length() == 4 )
                      CSE109List.add(Integer.parseInt("0"));
                  else
                      CSE109List.add(Integer.parseInt(values[9]));

                  if(values[10].length() == 4 )
                      CSE110List.add(Integer.parseInt("0"));
                  else
                      CSE110List.add(Integer.parseInt(values[10]));

                  if(values[11].length() == 4 )
                      CSE111List.add(Integer.parseInt("0"));
                  else
                      CSE111List.add(Integer.parseInt(values[11]));

                  if(values[12].length() == 4 )
                      CSE112List.add(Integer.parseInt("0"));
                  else
                      CSE112List.add(Integer.parseInt(values[12]));

                  if(values[13].length() == 4 )
                      CSE113List.add(Integer.parseInt("0"));
                  else
                      CSE113List.add(Integer.parseInt(values[13]));

                  if(values[14].length() == 4 )
                      CSE114List.add(Integer.parseInt("0"));
                  else
                      CSE114List.add(Integer.parseInt(values[14]));

                  if(values[15].length() == 4 )
                      CSE115List.add(Integer.parseInt("0"));
                  else
                      CSE115List.add(Integer.parseInt(values[15]));

                  if(values[16].length() == 4 )
                      CSE116List.add(Integer.parseInt("0"));
                  else
                      CSE116List.add(Integer.parseInt(values[16]));

                  if(values[17].length() == 4 )
                      CSE117List.add(Integer.parseInt("0"));
                  else
                      CSE117List.add(Integer.parseInt(values[17]));

                  if(values[18].length() == 4 )
                      CSE118List.add(Integer.parseInt("0"));
                  else
                      CSE118List.add(Integer.parseInt(values[18]));

                  if(values[19].length() == 4 )
                      CSE119List.add(Integer.parseInt("0"));
                  else
                      CSE119List.add(Integer.parseInt(values[19]));

                  if(values[20].length() == 4 )
                      CSE120List.add(Integer.parseInt("0"));
                  else
                      CSE120List.add(Integer.parseInt(values[20]));

              }
          }

      } catch (FileNotFoundException e){
          e.printStackTrace();
      } catch(IOException e){}
  }

  public ArrayList<Double> AverageModuleMark(ArrayList<Integer> a)
  {
   double count = 19;

   for(int i = 0; i < a.size(); i++)
   {
       double total = 0.0;
       double Average = 0;
       total = CSE101List.get(i) + CSE102List.get(i) + CSE103List.get(i) + CSE104List.get(i) + CSE105List.get(i) + CSE106List.get(i) +
       CSE107List.get(i) + CSE108List.get(i) + CSE109List.get(i) + CSE110List.get(i) + CSE111List.get(i) + CSE112List.get(i) + CSE113List.get(i) + CSE114List.get(i)+ CSE115List.get(i) + CSE116List.get(i) + CSE117List.get(i) + CSE118List.get(i) + CSE119List.get(i) + CSE120List.get(i) - a.get(i);

       Average = total/count;
       AverageModuleMark.add(Average);
   }

   return AverageModuleMark;
  }


  public ArrayList<Integer> GetStudentID()
  {
      return StudentIdList;
  }

  public ArrayList<Integer> GetCSE101()
  {
      return CSE101List;
  }
  public ArrayList<Integer> GetCSE102()
  {
      return CSE102List;
  }
  public ArrayList<Integer> GetCSE103()
  {
      return CSE103List;
  }
  public ArrayList<Integer> GetCSE104()
  {
      return CSE104List;
  }
  public ArrayList<Integer> GetCSE105()
  {
      return CSE105List;
  }
  public ArrayList<Integer> GetCSE106()
    {
        return CSE106List;
    }
  public ArrayList<Integer> GetCSE107()
  {
      return CSE107List;
  }
  public ArrayList<Integer> GetCSE108()
  {
      return CSE108List;
  }
  public ArrayList<Integer> GetCSE109()
  {
      return CSE109List;
  }
  public ArrayList<Integer> GetCSE110()
  {
      return CSE110List;
  }
  public ArrayList<Integer> GetCSE111()
  {
      return CSE111List;
  }
  public ArrayList<Integer> GetCSE112()
  {
      return CSE112List;
  }
  public ArrayList<Integer> GetCSE113()
  {
      return CSE113List;
  }
  public ArrayList<Integer> GetCSE114()
  {
      return CSE114List;
  }
  public ArrayList<Integer> GetCSE115()
  {
      return CSE115List;
  }
  public ArrayList<Integer> GetCSE116()
  {
      return CSE116List;
  }
  public ArrayList<Integer> GetCSE117()
  {
      return CSE117List;
  }
  public ArrayList<Integer> GetCSE118()
  {
      return CSE118List;
  }
  public ArrayList<Integer> GetCSE119()
  {
      return CSE119List;
  }
  public ArrayList<Integer> GetCSE120()
  {
      return CSE120List;
  }

    public static void main(String[] args) {
        ReadFile r = new ReadFile();
        r.ReadCSVFile();
        r.AverageModuleMark(r.GetCSE101());
    }
}
