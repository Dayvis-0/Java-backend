package OperadoresComparacionTipos_7;
/*El instanceof el operador compara un objecto con un tipo especificado. Puede usarlo para probar si un objecto es una 
instancia de una clase, una instancia de una subclase o una instancia de una clase que implementa una interfaz particular*/
class ComparacionDeTipos {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Parent obj2 = new Child();
        
        System.out.println("obj1 instanceof Parentf: " + (obj1 instanceof Parent));
        System.out.println("obj1 instanceof Child: " + (obj1 instanceof Child));
        System.out.println("obj1 instanceof Parentf: " + (obj1 instanceof MyInterface));
        System.out.println("obj2 instanceof Parentf: " + (obj2 instanceof Parent));
        System.out.println("obj2 instanceof Child: " + (obj2 instanceof Child));
        System.out.println("obj2 instanceof Parentf: " + (obj2 instanceof MyInterface));
    }
}

class Parent {}
class Child extends Parent implements MyInterface {}
interface MyInterface {}