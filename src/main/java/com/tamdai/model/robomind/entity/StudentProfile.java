package com.tamdai.model.robomind.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "StudentProfile")
public class StudentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "stId")
    private String stId;

    @Column(name = "stNickname")
    private String stNickname;

    @Column(name = "stFirstname")
    private String stFirstname;

    @Column(name = "stLastname")
    private String stLastname;

    @Column(name = "stSchool")
    private String stSchool;

    @Column(name = "stDate")
    private String stDate;

    @Column(name = "stAge")
    private String stAge;

    @Column(name = "stParent")
    private String stParent;

    @Column(name = "stEmail")
    private String stEmail;

    @Column(name = "stMobile")
    private String stMobile;

    @Column(name = "stStart")
    private String stStart;
    
    @Column(name = "stRole")
    private String stRole;

    @ManyToMany(fetch = FetchType.EAGER)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Set<RoboImage> roboImageSet = new HashSet<>();

    @ManyToMany(fetch = FetchType.EAGER)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Set<Content> contents = new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStId() {
        return stId;
    }

    public void setStId(String stId) {
        this.stId = stId;
    }

    public String getStNickname() {
        return stNickname;
    }

    public void setStNickname(String stNickname) {
        this.stNickname = stNickname;
    }

    public String getStFirstname() {
        return stFirstname;
    }

    public void setStFirstname(String stFirstname) {
        this.stFirstname = stFirstname;
    }

    public String getStLastname() {
        return stLastname;
    }

    public void setStLastname(String stLastname) {
        this.stLastname = stLastname;
    }

    public String getStSchool() {
        return stSchool;
    }

    public void setStSchool(String stSchool) {
        this.stSchool = stSchool;
    }

    public String getStDate() {
        return stDate;
    }

    public void setStDate(String stDate) {
        this.stDate = stDate;
    }

    public String getStAge() {
        return stAge;
    }

    public void setStAge(String stAge) {
        this.stAge = stAge;
    }

    public String getStParent() {
        return stParent;
    }

    public void setStParent(String stParent) {
        this.stParent = stParent;
    }

    public String getStEmail() {
        return stEmail;
    }

    public void setStEmail(String stEmail) {
        this.stEmail = stEmail;
    }

    public String getStMobile() {
        return stMobile;
    }

    public void setStMobile(String stMobile) {
        this.stMobile = stMobile;
    }

    public String getStStart() {
        return stStart;
    }

    public void setStStart(String stStart) {
        this.stStart = stStart;
    }

    public Set<RoboImage> getRoboImageSet() {
        return roboImageSet;
    }

    public void setRoboImageSet(Set<RoboImage> roboImageSet) {
        this.roboImageSet = roboImageSet;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    public String getStRole() {
		return stRole;
	}

	public void setStRole(String stRole) {
		this.stRole = stRole;
	}

	public StudentProfile() {
    }

    public StudentProfile(String stId, String stNickname, String stFirstname, String stLastname, String stSchool, String stDate, String stAge, String stParent, String stEmail, String stMobile, String stStart) {
        this.stId = stId;
        this.stNickname = stNickname;
        this.stFirstname = stFirstname;
        this.stLastname = stLastname;
        this.stSchool = stSchool;
        this.stDate = stDate;
        this.stAge = stAge;
        this.stParent = stParent;
        this.stEmail = stEmail;
        this.stMobile = stMobile;
        this.stStart = stStart;
    }

    public StudentProfile(String stId, String stNickname, String stFirstname, String stLastname, String stSchool, String stDate, String stAge, String stParent, String stEmail, String stMobile, String stStart, Set<RoboImage> roboImageSet, Set<Content> contents) {
        this.stId = stId;
        this.stNickname = stNickname;
        this.stFirstname = stFirstname;
        this.stLastname = stLastname;
        this.stSchool = stSchool;
        this.stDate = stDate;
        this.stAge = stAge;
        this.stParent = stParent;
        this.stEmail = stEmail;
        this.stMobile = stMobile;
        this.stStart = stStart;
        this.roboImageSet = roboImageSet;
        this.contents = contents;
    }

    public StudentProfile(String stId, String stNickname, String stFirstname, String stLastname, String stSchool, String stDate, String stAge, String stParent, String stEmail, String stMobile, String stStart, Set<RoboImage> roboImageSet) {
        this.stId = stId;
        this.stNickname = stNickname;
        this.stFirstname = stFirstname;
        this.stLastname = stLastname;
        this.stSchool = stSchool;
        this.stDate = stDate;
        this.stAge = stAge;
        this.stParent = stParent;
        this.stEmail = stEmail;
        this.stMobile = stMobile;
        this.stStart = stStart;
        this.roboImageSet = roboImageSet;
    }

    public StudentProfile(long id, String stId, String stNickname, String stFirstname, String stLastname,
			String stSchool, String stDate, String stAge, String stParent, String stEmail, String stMobile,
			String stStart, String stRole, Set<RoboImage> roboImageSet, Set<Content> contents) {
		super();
		this.id = id;
		this.stId = stId;
		this.stNickname = stNickname;
		this.stFirstname = stFirstname;
		this.stLastname = stLastname;
		this.stSchool = stSchool;
		this.stDate = stDate;
		this.stAge = stAge;
		this.stParent = stParent;
		this.stEmail = stEmail;
		this.stMobile = stMobile;
		this.stStart = stStart;
		this.stRole = stRole;
		this.roboImageSet = roboImageSet;
		this.contents = contents;
	}

	@Override
	public String toString() {
		return "StudentProfile [id=" + id + ", stId=" + stId + ", stNickname=" + stNickname + ", stFirstname="
				+ stFirstname + ", stLastname=" + stLastname + ", stSchool=" + stSchool + ", stDate=" + stDate
				+ ", stAge=" + stAge + ", stParent=" + stParent + ", stEmail=" + stEmail + ", stMobile=" + stMobile
				+ ", stStart=" + stStart + ", stRole=" + stRole + ", roboImageSet=" + roboImageSet + ", contents="
				+ contents + "]";
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentProfile other = (StudentProfile) obj;
		if (contents == null) {
			if (other.contents != null)
				return false;
		} else if (!contents.equals(other.contents))
			return false;
		if (id != other.id)
			return false;
		if (roboImageSet == null) {
			if (other.roboImageSet != null)
				return false;
		} else if (!roboImageSet.equals(other.roboImageSet))
			return false;
		if (stAge == null) {
			if (other.stAge != null)
				return false;
		} else if (!stAge.equals(other.stAge))
			return false;
		if (stDate == null) {
			if (other.stDate != null)
				return false;
		} else if (!stDate.equals(other.stDate))
			return false;
		if (stEmail == null) {
			if (other.stEmail != null)
				return false;
		} else if (!stEmail.equals(other.stEmail))
			return false;
		if (stFirstname == null) {
			if (other.stFirstname != null)
				return false;
		} else if (!stFirstname.equals(other.stFirstname))
			return false;
		if (stId == null) {
			if (other.stId != null)
				return false;
		} else if (!stId.equals(other.stId))
			return false;
		if (stLastname == null) {
			if (other.stLastname != null)
				return false;
		} else if (!stLastname.equals(other.stLastname))
			return false;
		if (stMobile == null) {
			if (other.stMobile != null)
				return false;
		} else if (!stMobile.equals(other.stMobile))
			return false;
		if (stNickname == null) {
			if (other.stNickname != null)
				return false;
		} else if (!stNickname.equals(other.stNickname))
			return false;
		if (stParent == null) {
			if (other.stParent != null)
				return false;
		} else if (!stParent.equals(other.stParent))
			return false;
		if (stRole == null) {
			if (other.stRole != null)
				return false;
		} else if (!stRole.equals(other.stRole))
			return false;
		if (stSchool == null) {
			if (other.stSchool != null)
				return false;
		} else if (!stSchool.equals(other.stSchool))
			return false;
		if (stStart == null) {
			if (other.stStart != null)
				return false;
		} else if (!stStart.equals(other.stStart))
			return false;
		return true;
	}

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contents == null) ? 0 : contents.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((roboImageSet == null) ? 0 : roboImageSet.hashCode());
		result = prime * result + ((stAge == null) ? 0 : stAge.hashCode());
		result = prime * result + ((stDate == null) ? 0 : stDate.hashCode());
		result = prime * result + ((stEmail == null) ? 0 : stEmail.hashCode());
		result = prime * result + ((stFirstname == null) ? 0 : stFirstname.hashCode());
		result = prime * result + ((stId == null) ? 0 : stId.hashCode());
		result = prime * result + ((stLastname == null) ? 0 : stLastname.hashCode());
		result = prime * result + ((stMobile == null) ? 0 : stMobile.hashCode());
		result = prime * result + ((stNickname == null) ? 0 : stNickname.hashCode());
		result = prime * result + ((stParent == null) ? 0 : stParent.hashCode());
		result = prime * result + ((stRole == null) ? 0 : stRole.hashCode());
		result = prime * result + ((stSchool == null) ? 0 : stSchool.hashCode());
		result = prime * result + ((stStart == null) ? 0 : stStart.hashCode());
		return result;
	}
}
