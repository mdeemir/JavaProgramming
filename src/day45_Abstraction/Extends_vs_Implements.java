package day45_Abstraction;

//extends:
class C{

}

class A{

}

class B extends A{ //class B extends A, C  YAZAMAZSIN ÇÜNKÜ BİRDEN ÇOK EXTEND CALSS OLAMAZ

}


interface Z{

}

interface X{

}

interface Y extends X, Z{ // BU ŞEKİLDE OLABİLİR ÇÜNKÜ MULTİPLE İNTERFACE A İZİN VERİYOR JAVA
//AMA İNTERFACE CLASS TAN BİRŞEY İNHERRİT EDEMEZ. SADECE İNTERFACE DEN EXTEND EDEBİLİR

}


//implements

class D implements X,Y,Z{ // BU DA OLABİLİR. BURDA DA MULTİPLE İNTERFACE E İZİN VERİYOR
//AMA İNTERFACE CLASS TAN BİRŞEY İNHERRİT EDEMEZ
}


public class Extends_vs_Implements extends A implements X, Y, Z{
//public class Extends_vs_Implements implements X, Y, Z extends A  BU ŞEKİLDE OLAMAZ ÇÜNKÜ İNTERFACE CLASS I EXTEND EDEMEZ
    // ÖNCE EXTEND SONRA İNTERFACE.

}
