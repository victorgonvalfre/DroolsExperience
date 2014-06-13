package br.edu.sr.ifes.mpn.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.edu.sr.ifes.mpn.model.*;
import br.edu.sr.ifes.mpn.util.LocalMorte;
import br.edu.sr.ifes.mpn.util.TipoMorte;
import br.edu.sr.ifes.mpn.util.TipoRecusa;

import org.junit.Before;
import org.junit.Test;

import br.edu.sr.ifes.seec.business.engine.RuleEngine;

public class TesteDoacaoNegada {

	private RuleEngine ruleEngine = new RuleEngine();
	private final String DSLRFile = "DoacaoNegada.dslr";
	private final String DSLFile = "DoacaoNegada.dsl";
	
	@Before
	public void before()
	{
		ruleEngine.config(DSLRFile,DSLFile);
	}

	@Test
	public void testePacienteDoador()
	{
		
       	Calendar cal = Calendar.getInstance();
       	Date dateAux = cal.getTime();
       	dateAux.setHours(dateAux.getHours()+1);
       	
    	//Criando CausaMortis
    	CausaMortis causaMortis = new CausaMortis();
    	causaMortis.setTipoMorte(TipoMorte.Outros);
    	causaMortis.setDescricao("Batida de Carro");
    	
    	//Setor
    	Setor setor = new Setor();
    	setor.setNome("Vitoria");
    	
    	//Criando Obito
    	Obito obito = new Obito();
    	obito.setDataObito(cal.getTime());
    	obito.setSetor(setor);
    	obito.setCausaMortis(causaMortis);
    	
    	//Criando Motivo recusa
    	MotivoRecusa motivoRecusa = new MotivoRecusa();
    	motivoRecusa.setDescricao("Minha religião não permite, vou enterar meu filho de acordo com ela!");
    	motivoRecusa.setTipoRecusa(TipoRecusa.RecusaFamiliar);
    	
    	//Criando Doacao
    	Doacao doacao = new Doacao(false, obito);
    	
    	//Criando Notificao
        ProcessoNotificacao notificaco = new ProcessoNotificacao();
        notificaco.setCodigo("codigo2");
        notificaco.setArquivado(false);
        notificaco.setDataAbertura(dateAux);
        notificaco.setObito(obito);
        
	 	Instituicao instituicao1 = new Instituicao();
	 	instituicao1.setNome("Jayme");
	 	//instituicao1.setLstCaptacoesRelizadas(new ArrayList<Captacao>());

        
	 	Instituicao instituicao2 = new Instituicao();
	 	instituicao2.setNome("Outros");
	 	//instituicao2.setLstCaptacoesRelizadas(new ArrayList<Captacao>());      
        
		//Adiciono a objeto na sessao
	 	ruleEngine.addObject(instituicao1);
	 	ruleEngine.addObject(instituicao2);
		ruleEngine.addObject(causaMortis);
		ruleEngine.addObject(obito);
		ruleEngine.addObject(notificaco);
		ruleEngine.addObject(motivoRecusa);
		ruleEngine.addObject(doacao);
		
		//Disparar as regras
		ruleEngine.FireRules();
		//Liberar a sessao
		ruleEngine.dispose();
	}

	
	
}
