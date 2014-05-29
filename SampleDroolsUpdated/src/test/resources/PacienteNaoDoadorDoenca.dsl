[condition][]Validar notificacao =$n : Notificacao($o: Obito)
[condition][]Examinar obito = $o1: Obito(this == $o, $c: CausaMortis)
[condition][]Verificar morte por doenca= $c1: CausaMortis(this == $c, tipoMorte == TipoMorte.DoencaContagiosa)

[consequence][]Display msgDoenca=System.out.println("---> Paciente com Doença Contagiosa! notificação de codigo: -----> "+ $n.getCodigo()+ " não pode ser tratado como possivel doador!");
[consequence][]Retira Notificacao= retract($n)