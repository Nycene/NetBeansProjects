/* 
 * File:   Classe.h
 * Author: Naycene Boussoffara
 *
 * Created on 9 mai 2017, 11:49
 */

#ifndef CLASSE_H
#define CLASSE_H
#include <string>
using namespace std;

class Etudiant {
    int matricule;
    string nom;
    int nbrNotes;
    int *tabNotes;
    
public:
    Etudiant();
    Etudiant(string,int);
    ~Etudiant();
    Etudiant (const Etudiant &);
    int getMatricule();
    string getNom();
    int getNbr_notes();
    void setNom(const string &);
    void saisie();
    void affichage();
    float moyenne();
    bool admis(); 
    bool comparer();
   
};

#endif

