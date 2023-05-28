// C++ code
//
void setup()
{
  //Primeiro Semáforo
  pinMode(0, OUTPUT); //Verde
  pinMode(1, OUTPUT); //Amarelo
  pinMode(2, OUTPUT); //Vermelho
  
  //Segundo Semáforo
  pinMode(3, OUTPUT); //Verde
  pinMode(4, OUTPUT); //Amarelo
  pinMode(5, OUTPUT); //Vermelho
  
  //Terceiro Semáforo
  pinMode(6, OUTPUT); 
  pinMode(7, OUTPUT); 
  pinMode(8, OUTPUT); 
  
  //Quarto Semáforo
  pinMode(9, OUTPUT); //Verde
  pinMode(10, OUTPUT); //Amarelo
  pinMode(11, OUTPUT); //Vermelho
  
  pinMode(13, OUTPUT);
  
}

void loop()
{
  digitalWrite(3, HIGH);
  digitalWrite(9, HIGH);
  digitalWrite(8, HIGH);
  digitalWrite(2, HIGH);
  
  
  digitalWrite(5, LOW);
  digitalWrite(11, LOW);
  digitalWrite(6, LOW);
  
  digitalWrite(0, LOW);
  digitalWrite(7, LOW);
  digitalWrite(1, LOW);
  delay(3000);
  
  digitalWrite(3, LOW);
  digitalWrite(9, LOW);
  digitalWrite(4, HIGH);
  digitalWrite(10, HIGH);
  delay(3000);
  
  tone(13,261);
  delay(200);
  noTone(13);
  
  digitalWrite(6, HIGH);
  digitalWrite(0, HIGH);
  
  digitalWrite(8, LOW);
  digitalWrite(2, LOW);
  digitalWrite(4, LOW);
  
  digitalWrite(10, LOW);
  digitalWrite(5, HIGH);
  digitalWrite(11, HIGH);
  delay(3000);
  
  digitalWrite(6, LOW);
  digitalWrite(0, LOW);
  
  digitalWrite(7, HIGH);
  digitalWrite(1, HIGH);
  delay(3000);
 
  tone(13,261);
  delay(200);
  noTone(13);
  
 
}



void exibirNumero(int numero) {

  switch (numero) {

    case 0:

      digitalWrite(SEG_A, HIGH);

      digitalWrite(SEG_B, HIGH);

      digitalWrite(SEG_C, HIGH);

      digitalWrite(SEG_D, HIGH);

      digitalWrite(SEG_E, HIGH);

      digitalWrite(SEG_F, HIGH);

      digitalWrite(SEG_G, LOW);

      break;

    case 1:

      digitalWrite(SEG_A, LOW);

      digitalWrite(SEG_B, HIGH);

      digitalWrite(SEG_C, HIGH);

      digitalWrite(SEG_D, LOW);

      digitalWrite(SEG_E, LOW);

      digitalWrite(SEG_F, LOW);

      digitalWrite(SEG_G, LOW);

      break;

    case 2:

      // código para exibir o número 2

      break;

    // adicione os casos para os números restantes

  }

}
