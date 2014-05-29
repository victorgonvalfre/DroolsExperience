[condition][]Validar notificacao =$n : Notificacao($o: Obito)
[condition][]Checkar time {timeStamp}=$n1: Notificacao(this == $n, getDelayTime() > {timeStamp}) 
[condition][]Examinar obito = $o1: Obito(this == $o, $c: CausaMortis)
[condition][]Verificar morte por doenca= $c1: CausaMortis(this == $c, tipoMorte == TipoMorte.Outros)

[consequence][]Display msgNotificacaoRestanten= System.out.println("---> Notificação de codigo: -----> "+ $n.getCodigo()+ " agendar entrevista, possivel doador!");
[consequence][]Cria entrevista= Doacao doacao = new Doacao(true, null, $o1);
[consequence][]Agenda entrevista = insert(doacao);
