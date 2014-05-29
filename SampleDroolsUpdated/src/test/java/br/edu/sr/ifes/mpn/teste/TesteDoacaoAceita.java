package br.edu.sr.ifes.mpn.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.edu.sr.ifes.mpn.model.*;
import br.edu.sr.ifes.mpn.util.LocalMorte;
import br.edu.sr.ifes.mpn.util.TipoMorte;

import org.junit.Before;
import org.junit.Test;

import br.edu.sr.ifes.seec.business.engine.RuleEngine;

public class TesteDoacaoAceita {

	private RuleEngine ruleEngine = new RuleEngine();
	private final String DSLRFile = "DoacaoAceita.dslr";
	private final String DSLFile = "DoacaoAceita.dsl";
	
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
    	
    	//Criando Obito
    	Obito obito = new Obito();
    	obito.setDataObito(cal.getTime());
    	obito.setLocalMorte(LocalMorte.Vitoria);
    	obito.setCausaMortis(causaMortis);
    	
    	//Criando Doacao
    	Doacao doacao = new Doacao(true, null, obito);
    	
    	//Criando Notificao
        Notificacao notificaco = new Notificacao();
        notificaco.setCodigo("codigo2");
        notificaco.setDataNotificacao(dateAux);
        notificaco.setObito(obito);
        
	 	Instituicao instituicao1 = new Instituicao();
	 	instituicao1.setNome("Jayme");
	 	//instituicao1.setLstCaptacoesRelizadas(new ArrayList<Captacao>());
	 	instituicao1.setSigla("vix");
        
	 	Instituicao instituicao2 = new Instituicao();
	 	instituicao2.setNome("Outros");
	 	//instituicao2.setLstCaptacoesRelizadas(new ArrayList<Captacao>());
	 	instituicao2.setSigla("out");        
        
		//Adiciono a objeto na sessao
	 	ruleEngine.addObject(instituicao1);
	 	ruleEngine.addObject(instituicao2);
		ruleEngine.addObject(causaMortis);
		ruleEngine.addObject(obito);
		ruleEngine.addObject(notificaco);
		ruleEngine.addObject(doacao);
		
		//Disparar as regras
		ruleEngine.FireRules();
		//Liberar a sessao
		ruleEngine.dispose();
	}

	
	
}
