package project;

public class LetterGrade {
    public LetterGrade() {

    }
    public String convertGrade(Integer grade){
        validateNull(grade);
        if(grade >= 90){
            return "A";
        }
        else if(grade >= 75){
            return "A-";
        }
        else if(grade >= 65){
            return "B";
        }
        else if(grade >= 55){
            return "C";
        }
        else{
            return "D";
        }
    }
    private void validateNull(Integer grade){
        if(grade == null){
            throw new IllegalArgumentException("Parameters cannot be null");
        }
    }
}
