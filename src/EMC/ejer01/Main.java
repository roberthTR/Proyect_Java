package EMC.ejer01;

public class Main {

    

    public static void main(String[] args) {

        Docente jose = new Docente("Jose Luis, RAMIREZ AVALOS");
        Docente manuel = new Docente("Manuel, MEJIA LOPEZ");
        Docente juan = new Docente("Juan Jose, ZAPATA GOMEZ");

        Docente alejo = new Docente("Alejandro, DE LA TORRE");
        Docente susan = new Docente("Susana, TABRAG TABRAG");
        Docente eli = new Docente("Elizabeth Ester, TRUJILLO SOTO");

        Docente freddy = new Docente("Freddy Clayderman, VIGILIO ARRATEA");
        Docente roberth = new Docente("Roberth, TRUJILLO MENDOZA");
        Docente ethel = new Docente("Ethel Jhovani, MANZANO LOZANO");

        Curso cursoCalculo = new Curso("Calculo II");
        cursoCalculo.setDocente(jose);
        cursoCalculo.setDocente(manuel);
        cursoCalculo.setDocente(juan);

        Curso cursoIngles = new Curso("Ingles");
        cursoIngles.setDocente(alejo);
        cursoIngles.setDocente(susan);
        cursoIngles.setDocente(eli);

        Curso cursoPOO = new Curso("Programacion Orientada a Objetos");
        cursoPOO.setDocente(freddy);
        cursoPOO.setDocente(roberth);
        cursoPOO.setDocente(ethel);
        
        Semestre semestreIV = new Semestre("IV");

        Matricula matricula2022 = new Matricula(2022);
        
        Estudiante estudiante = new Estudiante("Roberth Jerson, TORRES RIMAC");
        System.out.println();
        System.out.println("Estudiante: "+estudiante.getNombre());
        System.out.println();
        System.out.println("Año de Matricula: "+matricula2022.getAño());
        System.out.println();
        System.out.println("Semestre: "+semestreIV.getNumero());
        System.out.println();
        System.out.println("Cursos Matriculado: ");
        System.out.println();
        matricula2022.setCurso(cursoPOO);
        matricula2022.setCurso(cursoIngles);
        matricula2022.setCurso(cursoCalculo);

        for(Curso c: matricula2022.getCurso()){
            
            System.out.println("Curso: "+c.getNombre());

            for(Docente d: c.getDocente()){

                System.out.println("Docente: "+d.getNombre());
            }
            System.out.println();
        }
    }
    
}


