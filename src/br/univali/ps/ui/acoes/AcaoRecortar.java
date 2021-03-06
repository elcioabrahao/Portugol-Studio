/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.ps.ui.acoes;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.Action;
import javax.swing.KeyStroke;
import org.fife.ui.rtextarea.RTextArea;
import org.fife.ui.rtextarea.RecordableTextAction;

/**
 *
 * @author Fillipi Pelz
 */
public class AcaoRecortar extends Acao implements PropertyChangeListener
{

    public AcaoRecortar()
    {
        super("Trecho recortado com sucesso");
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("ctrl X"));
    }

    public void iniciar()
    {
        RecordableTextAction rta = RTextArea.getAction(RTextArea.CUT_ACTION);
        rta.putValue(Acao.SMALL_ICON, this.getValue(Acao.SMALL_ICON));
        rta.addPropertyChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt)
    {
        if (evt.getPropertyName().equals("enabled"))
        {
            this.setEnabled((Boolean) evt.getNewValue());
        }
    }

    @Override
    protected void executar(ActionEvent e) throws Exception
    {
        RTextArea.getAction(RTextArea.CUT_ACTION).actionPerformed(e);
    }
}
