package azat.curs.curs.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String firstname;
    private String surname;
    private String address;
    private Integer month_inc;
    private String sec_surname;
    private String passport_ser;
    private String passport_num;
    private String by_who;
    private String ident_num;
    private String birth_place;
    private String city;
    private Integer city_id;
    private String tel;
    private String email;
    private String work_place;
    private String position;
    private String fam_status;
    private Integer fs_id;
    private String residence;
    private Integer residence_id;
    private String disability;
    private Integer disability_id;
    private boolean pensioner;
    private boolean duty_bound;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getMonth_inc() {
        return month_inc;
    }

    public void setMonth_inc(Integer month_inc) {
        this.month_inc = month_inc;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSec_surname() {
        return sec_surname;
    }

    public void setSec_surname(String sec_surname) {
        this.sec_surname = sec_surname;
    }

    public String getPassport_ser() {
        return passport_ser;
    }

    public void setPassport_ser(String passport_ser) {
        this.passport_ser = passport_ser;
    }

    public String getPassport_num() {
        return passport_num;
    }

    public void setPassport_num(String passport_num) {
        this.passport_num = passport_num;
    }

    public String getBy_who() {
        return by_who;
    }

    public void setBy_who(String by_who) {
        this.by_who = by_who;
    }

    public String getIdent_num() {
        return ident_num;
    }

    public void setIdent_num(String ident_num) {
        this.ident_num = ident_num;
    }

    public String getBirth_place() {
        return birth_place;
    }

    public void setBirth_place(String birth_place) {
        this.birth_place = birth_place;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getCity_id() {
        return city_id;
    }

    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWork_place() {
        return work_place;
    }

    public void setWork_place(String work_place) {
        this.work_place = work_place;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFam_status() {
        return fam_status;
    }

    public void setFam_status(String fam_status) {
        this.fam_status = fam_status;
    }

    public Integer getFs_id() {
        return fs_id;
    }

    public void setFs_id(Integer fs_id) {
        this.fs_id = fs_id;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public Integer getResidence_id() {
        return residence_id;
    }

    public void setResidence_id(Integer residence_id) {
        this.residence_id = residence_id;
    }

    public String getDisability() {
        return disability;
    }

    public void setDisability(String disability) {
        this.disability = disability;
    }

    public Integer getDisability_id() {
        return disability_id;
    }

    public void setDisability_id(Integer disability_id) {
        this.disability_id = disability_id;
    }

    public boolean isPensioner() {
        return pensioner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public boolean isDuty_bound() {
        return duty_bound;
    }

    public void setDuty_bound(boolean duty_bound) {
        this.duty_bound = duty_bound;
    }


    public Client() {
    }

    public Client(Integer id, String firstname, String surname, String address, Integer month_inc, String sec_surname,
                  String passport_ser, String passport_num, String by_who, String ident_num, String birth_place,
                  String city, Integer city_id, String tel, String email, String work_place, String position,
                  String fam_status, Integer fs_id, String residence, Integer residence_id, String disability,
                  Integer disability_id, boolean pensioner, boolean duty_bound) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.address = address;
        this.month_inc = month_inc;
        this.sec_surname = sec_surname;
        this.passport_ser = passport_ser;
        this.passport_num = passport_num;
        this.by_who = by_who;
        this.ident_num = ident_num;
        this.birth_place = birth_place;
        this.city = city;
        this.city_id = city_id;
        this.tel = tel;
        this.email = email;
        this.work_place = work_place;
        this.position = position;
        this.fam_status = fam_status;
        this.fs_id = fs_id;
        this.residence = residence;
        this.residence_id = residence_id;
        this.disability = disability;
        this.disability_id = disability_id;
        this.pensioner = pensioner;
        this.duty_bound = duty_bound;

    }
}
