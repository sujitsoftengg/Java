package Ch21_GenericsAndDimond;

public class TestGenerics<T> {

    private T variableFirst;
    private T variableSecond;

    public T getFunctionMethod (){
        return variableSecond;
    }

    public void setFunctionMethod(T anythings){
        this.variableFirst = anythings;
    }

}
