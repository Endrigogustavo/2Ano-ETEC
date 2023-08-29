// C++ code
//

//A se refere ao sentido frontal e
//B ao sentido de retorno

#define pinMot1A 13
#define pinMot1B 12

#define pinMot2A 3
#define pinMot2B 2



#define velocidade 1000

void setup() {
  // Configurações Dos Motores
  pinMode(pinMot1A, OUTPUT);
  pinMode(pinMot1B, OUTPUT);
  pinMode(pinMot2A, OUTPUT);
  pinMode(pinMot2B, OUTPUT);
  
  pinMode(3, OUTPUT);
  analogWrite(3, velocidade);
    
}

void loop() {
  // Código Principal
  		//Frente
  			digitalWrite(pinMot1A, HIGH);
  			digitalWrite(pinMot2A, HIGH);
  			delay(2000);
  			digitalWrite(pinMot1A, LOW);
  			digitalWrite(pinMot2A, LOW);

  			delay(2000);
  
		//Trás
  			digitalWrite(pinMot1B, HIGH);
  			digitalWrite(pinMot2B, HIGH);
  			delay(2000);
  			digitalWrite(pinMot1B, LOW);
  			digitalWrite(pinMot2B, LOW);
  
  			delay(2000);
  
  		//Esquerda
            digitalWrite(pinMot2A,HIGH);    
            digitalWrite(pinMot1B,HIGH);             
            delay(2000);
            digitalWrite(pinMot2A,LOW);         
  			digitalWrite(pinMot1B,LOW);
  			delay(2000);
  
  
  		//Direita
 			digitalWrite(pinMot1A,HIGH);
			digitalWrite(pinMot2B,HIGH);
  			delay(2000);
            digitalWrite(pinMot1A,LOW);
            digitalWrite(pinMot2B,LOW);             
            delay(2000);
                         
        
}
