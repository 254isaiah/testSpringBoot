package com.example.testSpringBoot.model;

import com.fasterxml.jackson.databind.DatabindException;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "dbTable")
public class Legislator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "cid")
    private String cid;
    @Column(name = "firstlast")
    private String firstlast;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "party")
    private String party;
    @Column(name = "office")
    private String office;
    @Column(name = "gender")
    private String gender;
    @Column(name = "first_elected")
    private Date first_elected;
    @Column(name = "exit_code")
    private int exit_code;
    @Column(name = "comments")
    private String comments;
    @Column(name = "phone")
    private String phone;
    @Column(name = "fax")
    private String fax;
    @Column(name = "website")
    private String website;
    @Column(name = "webform")
    private String webform;
    @Column(name = "congress_office")
    private String congress_office;
    @Column(name = "bioguide_id")
    private String bioguide_id;
    @Column(name = "votesmart_id")
    private String votesmart_id;
    @Column(name = "feccandid")
    private String feccandid;
    @Column(name = "twitter_id")
    private String twitter_id;
    @Column(name = "youtube_url")
    private String youtube_url;
    @Column(name = "facebook_id")
    private String facebook_id;
    @Column(name = "birthdate")
    private Date birthdate;

    public Legislator() {
    }

    public Legislator(long id, String cid, String firstlast, String lastname, String party, String office, String gender, Date first_elected, int exit_code, String comments, String phone, String fax, String website, String webform, String congress_office, String bioguide_id, String votesmart_id, String feccandid, String twitter_id, String youtube_url, String facebook_id, Date birthdate) {
        this.id = id;
        this.cid = cid;
        this.firstlast = firstlast;
        this.lastname = lastname;
        this.party = party;
        this.office = office;
        this.gender = gender;
        this.first_elected = first_elected;
        this.exit_code = exit_code;
        this.comments = comments;
        this.phone = phone;
        this.fax = fax;
        this.website = website;
        this.webform = webform;
        this.congress_office = congress_office;
        this.bioguide_id = bioguide_id;
        this.votesmart_id = votesmart_id;
        this.feccandid = feccandid;
        this.twitter_id = twitter_id;
        this.youtube_url = youtube_url;
        this.facebook_id = facebook_id;
        this.birthdate = birthdate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getFirstlast() {
        return firstlast;
    }

    public void setFirstlast(String firstlast) {
        this.firstlast = firstlast;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getFirst_elected() {
        return first_elected;
    }

    public void setFirst_elected(Date first_elected) {
        this.first_elected = first_elected;
    }

    public int getExit_code() {
        return exit_code;
    }

    public void setExit_code(int exit_code) {
        this.exit_code = exit_code;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getWebform() {
        return webform;
    }

    public void setWebform(String webform) {
        this.webform = webform;
    }

    public String getCongress_office() {
        return congress_office;
    }

    public void setCongress_office(String congress_office) {
        this.congress_office = congress_office;
    }

    public String getBioguide_id() {
        return bioguide_id;
    }

    public void setBioguide_id(String bioguide_id) {
        this.bioguide_id = bioguide_id;
    }

    public String getVotesmart_id() {
        return votesmart_id;
    }

    public void setVotesmart_id(String votesmart_id) {
        this.votesmart_id = votesmart_id;
    }

    public String getFeccandid() {
        return feccandid;
    }

    public void setFeccandid(String feccandid) {
        this.feccandid = feccandid;
    }

    public String getTwitter_id() {
        return twitter_id;
    }

    public void setTwitter_id(String twitter_id) {
        this.twitter_id = twitter_id;
    }

    public String getYoutube_url() {
        return youtube_url;
    }

    public void setYoutube_url(String youtube_url) {
        this.youtube_url = youtube_url;
    }

    public String getFacebook_id() {
        return facebook_id;
    }

    public void setFacebook_id(String facebook_id) {
        this.facebook_id = facebook_id;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Legislator{" +
                "id=" + id +
                ", cid='" + cid + '\'' +
                ", firstlast='" + firstlast + '\'' +
                ", lastname='" + lastname + '\'' +
                ", party='" + party + '\'' +
                ", office='" + office + '\'' +
                ", gender='" + gender + '\'' +
                ", first_elected=" + first_elected +
                ", exit_code=" + exit_code +
                ", comments='" + comments + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", website='" + website + '\'' +
                ", webform='" + webform + '\'' +
                ", congress_office='" + congress_office + '\'' +
                ", bioguide_id='" + bioguide_id + '\'' +
                ", votesmart_id='" + votesmart_id + '\'' +
                ", feccandid='" + feccandid + '\'' +
                ", twitter_id='" + twitter_id + '\'' +
                ", youtube_url='" + youtube_url + '\'' +
                ", facebook_id='" + facebook_id + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
