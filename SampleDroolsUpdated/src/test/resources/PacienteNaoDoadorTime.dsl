[condition][]Verificar notificacao ativa e =$n : Notificacao($o: Obito)
[condition][]checar se o tempo do processo n�o ultrapassou o limite de {timeStamp}=$n1: Notificacao(this == $n, getDelayTime() > {timeStamp}) 

[consequence][]Display estouro de tempo do processo=System.out.println("---> Paciente In�pito! notifica��o de codigo: -----> "+ $n.getCodigo()+ " n�o pode ser tratado como possivel doador!");
[consequence][]Retira Notificacao do processo = retract($n)