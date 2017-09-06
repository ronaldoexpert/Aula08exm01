package Aula08exm01.pkg2017;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JanelaTurmas extends JFrame {

    private final List<Turma> turmas;
    private final JList<Turma> lstTurmas = new JList<Turma>(new DefaultListModel<>());
    private final JList<Aluno> lstAlunos = new JList<Aluno>(new DefaultListModel<>());
    
    public JanelaTurmas(List<Turma> dados) {
        super("Turmas");
        this.turmas = dados;
        
        lstTurmas.setModel(new TurmaListModel(turmas));
        
        add(new JScrollPane(lstTurmas), BorderLayout.WEST);
        add(new JScrollPane(lstAlunos), BorderLayout.CENTER);
        
        lstTurmas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        lstTurmas.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Turma selecionada = lstTurmas.getSelectedValue();
                lstAlunos.setModel(new AlunosListModel(selecionada.getAlunos()));
            }
        });
        
    }
    
}
