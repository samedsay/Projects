package gameDemo.entities;

import java.time.LocalDate;

public class Campaign {

	private int campaingId;
	private String campaignName;
	private int campaignDiscount;
	private LocalDate campaignStartDate;
	private LocalDate campaignEndDate;

	public Campaign() {

	}

	public Campaign(int campaingId, String campaignName, int campaignDiscount, LocalDate campaignStartDate,
			LocalDate campaignEndDate) {
		super();
		this.campaingId = campaingId;
		this.campaignName = campaignName;
		this.campaignDiscount = campaignDiscount;
		this.campaignStartDate = campaignStartDate;
		this.campaignEndDate = campaignEndDate;
	}

	public int getCampaingId() {
		return campaingId;
	}

	public void setCampaingId(int campaingId) {
		this.campaingId = campaingId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getCampaignDiscount() {
		return campaignDiscount;
	}

	public void setCampaignDiscount(int campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}

	public LocalDate getCampaignStartDate() {
		return campaignStartDate;
	}

	public void setCampaignStartDate(LocalDate campaignStartDate) {
		this.campaignStartDate = campaignStartDate;
	}

	public LocalDate getCampaignEndDate() {
		return campaignEndDate;
	}

	public void setCampaignEndDate(LocalDate campaignEndDate) {
		this.campaignEndDate = campaignEndDate;
	}

}
