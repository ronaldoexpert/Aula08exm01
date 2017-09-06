package Aula08exm01.pkg2017;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class Aula08exm01 {

    private static List<Turma> getDados() {
        Aluno a1 = new Aluno("201176016", "Ronaldo Silveira");
        Aluno a2 = new Aluno("201176015", "Roberto Silva");
        Aluno a3 = new Aluno("201176014", "Ricardo Souza");
        
        Turma t1 = new Turma("DCC171");
        Turma t2 = new Turma("DCC172");
        
        t1.getAlunos().add(a1);
        t1.getAlunos().add(a3);
        t2.getAlunos().add(a1);
        t2.getAlunos().add(a2);
        t2.getAlunos().add(a3);
        
        List<Turma> turmas = new ArrayList<>();
        turmas.add(t1);
        turmas.add(t2);
        
        return turmas;
    }
    
    
    public static void main(String[] args) {
        
        JanelaTurmas janela = new JanelaTurmas(getDados());
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        janela.setTitle("Lista Turmas");
       
    }
    
}
