#include "Classe.h"
#include <iostream>


Etudiant ::Etudiant():matricule(0),nbrNotes(0) {
    int i;
    tabNotes=new int[nbrNotes];
    for (i=0;i<nbrNotes;i++)
        tabNotes[i]=0;
    matricule++;
};
Etudiant ::Etudiant(string name, int nb):nom(name){ 
    int i;
    nbrNotes=nb;
    tabNotes=new int[nbrNotes];
    for (i=0;i<nbrNotes;i++)
        tabNotes[i]=0;
    matricule++;
}; 
Etudiant ::~Etudiant(){
    delete[] tabNotes;
};
Etudiant ::Etudiant(const Etudiant& E){
    this->matricule=E.matricule;
    this->nbrNotes=E.nbrNotes;
    this->nom=E.nom;
    for(int i=0;i<nbrNotes;i++)
        this->tabNotes[i]=E.tabNotes[i];
};

int Etudiant:: getMatricule() {
    return matricule;
};
int Etudiant ::getNbr_notes() {
    return nbrNotes;
};
string Etudiant ::getNom(){
    return nom;
};
void Etudiant ::saisie(){
    for (int i=0;i<nbrNotes;i++)
    { cout <<"Donner la note:"<<i<<endl;
      cin>> tabNotes[i]; }
};
void Etudiant ::affichage(){
    cout<<"Matricule:"<<matricule<<endl;
    cout<<"Nom:"<<nom<<endl;
    cout<<"Nombre de notes:/t"<<nbrNotes<<endl;
    for(int i=0;i<nbrNotes;i++)
        cout<<"Notes"<<tabNotes[i]<<endl; 
};
float Etudiant ::moyenne(){
    float S=0;
    for(int i=0;i<nbrNotes;i++){
        S=tabNotes[i]+S;
    };
    return (S/nbrNotes);
};
bool Etudiant ::admis(){
    if (this->moyenne()<10)
        return false;
    else 
        return true;
};
 void Etudiant ::setNom(const string & n)
    {
        nom = n;
    };
    
    