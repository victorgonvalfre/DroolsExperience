[condition][]Verificar notificacao ativa e =$n : Notificacao($o: Obito)
[condition][]checar se o tempo do processo não ultrapassou o limite de {timeStamp}=$n1: Notificacao(this == $n, getDelayTime() > {timeStamp}) 

[consequence][]Display estouro de tempo do processo=System.out.println("---> Paciente Inápito! notificação de codigo: -----> "+ $n.getCodigo()+ " não pode ser tratado como possivel doador!");
[consequence][]Retira Notificacao do processo = retract($n)