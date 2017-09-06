package Aula08exm01.pkg2017;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

public class AlunosListModel implements ListModel<Aluno> {

    private final List<Aluno> aluno;    
    private final List<ListDataListener> dataListeners;
    
    public AlunosListModel(List<Aluno> alunos) {
        this.aluno = alunos;   
        this.dataListeners = new ArrayList<>();
    }

    @Override
    public int getSize() {
        return aluno.size();
    }

    @Override
    public Aluno getElementAt(int index) {
        return aluno.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        this.dataListeners.add(l);
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        this.dataListeners.remove(l);
    }
    
}
