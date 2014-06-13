[condition][]Verificar notificacao ativa e =$n : ProcessoNotificacao($o: Obito, arquivado == false)
[condition][]Examinar se obito = $o1: Obito(this == $o, $c: CausaMortis)
[condition][]foi causado por doenca= $c1: CausaMortis(this == $c, tipoMorte == TipoMorte.DoencaContagiosa)

[consequence][]Display paciente com doenca=System.out.println("---> Paciente com Doença Contagiosa! notificação de codigo: -----> "+ $n.getCodigo()+ " não pode ser tratado como possivel doador!");
[consequence][]Retira Notificacao do processo= retract($n)