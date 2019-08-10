package us.bojie.doordashlite.data.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Restaurant {

    /**
     * is_time_surging : false
     * max_order_size : null
     * delivery_fee : 0
     * max_composite_score : 10
     * id : 424382
     * merchant_promotions : [{"minimum_subtotal_monetary_fields":{"currency":"USD","display_string":"$0.00","unit_amount":null,"decimal_places":2},"delivery_fee":null,"delivery_fee_monetary_fields":{"currency":"USD","display_string":"$0.00","unit_amount":null,"decimal_places":2},"minimum_subtotal":null,"new_store_customers_only":false,"id":18429}]
     * average_rating : 4.5
     * menus : [{"popular_items":[{"price":1095,"description":"Most popular. Mint or regular oreos Ice Cream.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/4ffd4621-3b4d-4f42-b7bd-40a00c159b11-retina-large.jpg","id":70980130,"name":"Oreo Blast"},{"price":1095,"description":"Most popular. Bananas, Nutella, and graham cracker Ice Cream.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/57270d6d-e3dc-425d-8fd7-0ee4bd9fe70b-retina-large.jpg","id":70980138,"name":"Nutella & Chill"},{"price":1095,"description":"Most popular. Strawberries, graham crackers, and condensed milk Ice Cream.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/99231767-fd7b-4fca-b042-b6403ec76eee-retina-large.jpg","id":70980140,"name":"Strawberry Fantasy"},{"price":1095,"description":"Most popular Ice Cream.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/5c24683a-0133-49cb-9015-f721b0f89e7b-retina-large.jpg","id":70980129,"name":"Cereal Killer"},{"price":1095,"description":"Hazelnut coffee Ice Cream.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/2cfe76fb-82cf-47d8-b08f-2b281f295816-retina-large.jpg","id":70980135,"name":"Wake Me Up"},{"price":1095,"description":"Vanilla custard.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/af9db8c1-6c5f-4c73-ae9f-3d157d9b73de-retina-large.jpg","id":70980132,"name":"Bae-Sic Ice Cream"},{"price":1095,"description":"Almonds, chocolate, and marshmallows Ice Cream.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/a7c3bac8-5e44-4287-aaeb-dbec3d2aa8b3-retina-large.jpg","id":70980142,"name":"Rock n' Roll"},{"price":1095,"description":"Most popular. Thai tea. Ice Cream","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/af074363-fad4-4ef8-b3af-3dde4fbfb000-retina-large.jpg","id":70980144,"name":"Mai Thai"},{"price":1095,"description":"Avocado Ice Cream.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/3c7dfe81-0fd8-4a20-977f-21749c807df0-retina-large.jpg","id":70980136,"name":"Bravocado"},{"price":1095,"description":"Non-dairy and vegan Ice Cream.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/b8201f77-c164-4b5e-905d-899b10c2f902-retina-large.jpg","id":70980152,"name":"Strawberry Lemonade Sorbet Ice Cream"}],"is_catering":false,"subtitle":"All Day","id":743527,"name":"Icicles (San Mateo) All Day 3/26"}]
     * composite_score : 9
     * status_type : open
     * is_only_catering : false
     * status : 50 mins
     * number_of_ratings : 220
     * asap_time : 50
     * description : Dessert, Ice Cream
     * business : {"id":109924,"name":"ICICLES"}
     * tags : ["Dessert","Ice Cream"]
     * yelp_review_count : 0
     * business_id : 109924
     * extra_sos_delivery_fee : 0
     * yelp_rating : 0
     * cover_img_url : https://cdn.doordash.com/media/restaurant/cover/ICICLES829SanFranciscoCA.png
     * header_img_url : https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/4ffd4621-3b4d-4f42-b7bd-40a00c159b11-retina-large.jpg
     * address : {"city":"Mountain View","state":"CA","street":"292 Castro Street","lat":37.392822,"lng":-122.0798719,"printable_address":"292 Castro St, Mountain View, CA 94041, USA"}
     * price_range : 1
     * slug : icicles-mountain-view
     * name : Icicles (Mountain View)
     * is_newly_added : false
     * url : /store/icicles-mountain-view-424382/
     * service_rate : 11
     * promotion : null
     * featured_category_description : null
     */

    @SerializedName("is_time_surging")
    private boolean isTimeSurging;
    @SerializedName("max_order_size")
    private Object maxOrderSize;
    @SerializedName("delivery_fee")
    private int deliveryFee;
    @SerializedName("max_composite_score")
    private int maxCompositeScore;
    @SerializedName("id")
    private int id;
    @SerializedName("average_rating")
    private double averageRating;
    @SerializedName("composite_score")
    private int compositeScore;
    @SerializedName("status_type")
    private String statusType;
    @SerializedName("is_only_catering")
    private boolean isOnlyCatering;
    @SerializedName("status")
    private String status;
    @SerializedName("number_of_ratings")
    private int numberOfRatings;
    @SerializedName("asap_time")
    private int asapTime;
    @SerializedName("description")
    private String description;
    @SerializedName("business")
    private BusinessBean business;
    @SerializedName("yelp_review_count")
    private int yelpReviewCount;
    @SerializedName("business_id")
    private int businessId;
    @SerializedName("extra_sos_delivery_fee")
    private int extraSosDeliveryFee;
    @SerializedName("yelp_rating")
    private int yelpRating;
    @SerializedName("cover_img_url")
    private String coverImgUrl;
    @SerializedName("header_img_url")
    private String headerImgUrl;
    @SerializedName("address")
    private AddressBean address;
    @SerializedName("price_range")
    private int priceRange;
    @SerializedName("slug")
    private String slug;
    @SerializedName("name")
    private String name;
    @SerializedName("is_newly_added")
    private boolean isNewlyAdded;
    @SerializedName("url")
    private String url;
    @SerializedName("service_rate")
    private int serviceRate;
    @SerializedName("promotion")
    private Object promotion;
    @SerializedName("featured_category_description")
    private Object featuredCategoryDescription;
    @SerializedName("merchant_promotions")
    private List<MerchantPromotionsBean> merchantPromotions;
    @SerializedName("menus")
    private List<MenusBean> menus;
    @SerializedName("tags")
    private List<String> tags;

    public boolean isIsTimeSurging() {
        return isTimeSurging;
    }

    public void setIsTimeSurging(boolean isTimeSurging) {
        this.isTimeSurging = isTimeSurging;
    }

    public Object getMaxOrderSize() {
        return maxOrderSize;
    }

    public void setMaxOrderSize(Object maxOrderSize) {
        this.maxOrderSize = maxOrderSize;
    }

    public int getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(int deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public int getMaxCompositeScore() {
        return maxCompositeScore;
    }

    public void setMaxCompositeScore(int maxCompositeScore) {
        this.maxCompositeScore = maxCompositeScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public int getCompositeScore() {
        return compositeScore;
    }

    public void setCompositeScore(int compositeScore) {
        this.compositeScore = compositeScore;
    }

    public String getStatusType() {
        return statusType;
    }

    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    public boolean isIsOnlyCatering() {
        return isOnlyCatering;
    }

    public void setIsOnlyCatering(boolean isOnlyCatering) {
        this.isOnlyCatering = isOnlyCatering;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumberOfRatings() {
        return numberOfRatings;
    }

    public void setNumberOfRatings(int numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

    public int getAsapTime() {
        return asapTime;
    }

    public void setAsapTime(int asapTime) {
        this.asapTime = asapTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BusinessBean getBusiness() {
        return business;
    }

    public void setBusiness(BusinessBean business) {
        this.business = business;
    }

    public int getYelpReviewCount() {
        return yelpReviewCount;
    }

    public void setYelpReviewCount(int yelpReviewCount) {
        this.yelpReviewCount = yelpReviewCount;
    }

    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public int getExtraSosDeliveryFee() {
        return extraSosDeliveryFee;
    }

    public void setExtraSosDeliveryFee(int extraSosDeliveryFee) {
        this.extraSosDeliveryFee = extraSosDeliveryFee;
    }

    public int getYelpRating() {
        return yelpRating;
    }

    public void setYelpRating(int yelpRating) {
        this.yelpRating = yelpRating;
    }

    public String getCoverImgUrl() {
        return coverImgUrl;
    }

    public void setCoverImgUrl(String coverImgUrl) {
        this.coverImgUrl = coverImgUrl;
    }

    public String getHeaderImgUrl() {
        return headerImgUrl;
    }

    public void setHeaderImgUrl(String headerImgUrl) {
        this.headerImgUrl = headerImgUrl;
    }

    public AddressBean getAddress() {
        return address;
    }

    public void setAddress(AddressBean address) {
        this.address = address;
    }

    public int getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(int priceRange) {
        this.priceRange = priceRange;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsNewlyAdded() {
        return isNewlyAdded;
    }

    public void setIsNewlyAdded(boolean isNewlyAdded) {
        this.isNewlyAdded = isNewlyAdded;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getServiceRate() {
        return serviceRate;
    }

    public void setServiceRate(int serviceRate) {
        this.serviceRate = serviceRate;
    }

    public Object getPromotion() {
        return promotion;
    }

    public void setPromotion(Object promotion) {
        this.promotion = promotion;
    }

    public Object getFeaturedCategoryDescription() {
        return featuredCategoryDescription;
    }

    public void setFeaturedCategoryDescription(Object featuredCategoryDescription) {
        this.featuredCategoryDescription = featuredCategoryDescription;
    }

    public List<MerchantPromotionsBean> getMerchantPromotions() {
        return merchantPromotions;
    }

    public void setMerchantPromotions(List<MerchantPromotionsBean> merchantPromotions) {
        this.merchantPromotions = merchantPromotions;
    }

    public List<MenusBean> getMenus() {
        return menus;
    }

    public void setMenus(List<MenusBean> menus) {
        this.menus = menus;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public static class BusinessBean {
        /**
         * id : 109924
         * name : ICICLES
         */

        @SerializedName("id")
        private int id;
        @SerializedName("name")
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class AddressBean {
        /**
         * city : Mountain View
         * state : CA
         * street : 292 Castro Street
         * lat : 37.392822
         * lng : -122.0798719
         * printable_address : 292 Castro St, Mountain View, CA 94041, USA
         */

        @SerializedName("city")
        private String city;
        @SerializedName("state")
        private String state;
        @SerializedName("street")
        private String street;
        @SerializedName("lat")
        private double lat;
        @SerializedName("lng")
        private double lng;
        @SerializedName("printable_address")
        private String printableAddress;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLng() {
            return lng;
        }

        public void setLng(double lng) {
            this.lng = lng;
        }

        public String getPrintableAddress() {
            return printableAddress;
        }

        public void setPrintableAddress(String printableAddress) {
            this.printableAddress = printableAddress;
        }
    }

    public static class MerchantPromotionsBean {
        /**
         * minimum_subtotal_monetary_fields : {"currency":"USD","display_string":"$0.00","unit_amount":null,"decimal_places":2}
         * delivery_fee : null
         * delivery_fee_monetary_fields : {"currency":"USD","display_string":"$0.00","unit_amount":null,"decimal_places":2}
         * minimum_subtotal : null
         * new_store_customers_only : false
         * id : 18429
         */

        @SerializedName("minimum_subtotal_monetary_fields")
        private MinimumSubtotalMonetaryFieldsBean minimumSubtotalMonetaryFields;
        @SerializedName("delivery_fee")
        private Object deliveryFee;
        @SerializedName("delivery_fee_monetary_fields")
        private DeliveryFeeMonetaryFieldsBean deliveryFeeMonetaryFields;
        @SerializedName("minimum_subtotal")
        private Object minimumSubtotal;
        @SerializedName("new_store_customers_only")
        private boolean newStoreCustomersOnly;
        @SerializedName("id")
        private int id;

        public MinimumSubtotalMonetaryFieldsBean getMinimumSubtotalMonetaryFields() {
            return minimumSubtotalMonetaryFields;
        }

        public void setMinimumSubtotalMonetaryFields(MinimumSubtotalMonetaryFieldsBean minimumSubtotalMonetaryFields) {
            this.minimumSubtotalMonetaryFields = minimumSubtotalMonetaryFields;
        }

        public Object getDeliveryFee() {
            return deliveryFee;
        }

        public void setDeliveryFee(Object deliveryFee) {
            this.deliveryFee = deliveryFee;
        }

        public DeliveryFeeMonetaryFieldsBean getDeliveryFeeMonetaryFields() {
            return deliveryFeeMonetaryFields;
        }

        public void setDeliveryFeeMonetaryFields(DeliveryFeeMonetaryFieldsBean deliveryFeeMonetaryFields) {
            this.deliveryFeeMonetaryFields = deliveryFeeMonetaryFields;
        }

        public Object getMinimumSubtotal() {
            return minimumSubtotal;
        }

        public void setMinimumSubtotal(Object minimumSubtotal) {
            this.minimumSubtotal = minimumSubtotal;
        }

        public boolean isNewStoreCustomersOnly() {
            return newStoreCustomersOnly;
        }

        public void setNewStoreCustomersOnly(boolean newStoreCustomersOnly) {
            this.newStoreCustomersOnly = newStoreCustomersOnly;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public static class MinimumSubtotalMonetaryFieldsBean {
            /**
             * currency : USD
             * display_string : $0.00
             * unit_amount : null
             * decimal_places : 2
             */

            @SerializedName("currency")
            private String currency;
            @SerializedName("display_string")
            private String displayString;
            @SerializedName("unit_amount")
            private Object unitAmount;
            @SerializedName("decimal_places")
            private int decimalPlaces;

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getDisplayString() {
                return displayString;
            }

            public void setDisplayString(String displayString) {
                this.displayString = displayString;
            }

            public Object getUnitAmount() {
                return unitAmount;
            }

            public void setUnitAmount(Object unitAmount) {
                this.unitAmount = unitAmount;
            }

            public int getDecimalPlaces() {
                return decimalPlaces;
            }

            public void setDecimalPlaces(int decimalPlaces) {
                this.decimalPlaces = decimalPlaces;
            }
        }

        public static class DeliveryFeeMonetaryFieldsBean {
            /**
             * currency : USD
             * display_string : $0.00
             * unit_amount : null
             * decimal_places : 2
             */

            @SerializedName("currency")
            private String currency;
            @SerializedName("display_string")
            private String displayString;
            @SerializedName("unit_amount")
            private Object unitAmount;
            @SerializedName("decimal_places")
            private int decimalPlaces;

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getDisplayString() {
                return displayString;
            }

            public void setDisplayString(String displayString) {
                this.displayString = displayString;
            }

            public Object getUnitAmount() {
                return unitAmount;
            }

            public void setUnitAmount(Object unitAmount) {
                this.unitAmount = unitAmount;
            }

            public int getDecimalPlaces() {
                return decimalPlaces;
            }

            public void setDecimalPlaces(int decimalPlaces) {
                this.decimalPlaces = decimalPlaces;
            }
        }
    }

    public static class MenusBean {
        /**
         * popular_items : [{"price":1095,"description":"Most popular. Mint or regular oreos Ice Cream.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/4ffd4621-3b4d-4f42-b7bd-40a00c159b11-retina-large.jpg","id":70980130,"name":"Oreo Blast"},{"price":1095,"description":"Most popular. Bananas, Nutella, and graham cracker Ice Cream.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/57270d6d-e3dc-425d-8fd7-0ee4bd9fe70b-retina-large.jpg","id":70980138,"name":"Nutella & Chill"},{"price":1095,"description":"Most popular. Strawberries, graham crackers, and condensed milk Ice Cream.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/99231767-fd7b-4fca-b042-b6403ec76eee-retina-large.jpg","id":70980140,"name":"Strawberry Fantasy"},{"price":1095,"description":"Most popular Ice Cream.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/5c24683a-0133-49cb-9015-f721b0f89e7b-retina-large.jpg","id":70980129,"name":"Cereal Killer"},{"price":1095,"description":"Hazelnut coffee Ice Cream.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/2cfe76fb-82cf-47d8-b08f-2b281f295816-retina-large.jpg","id":70980135,"name":"Wake Me Up"},{"price":1095,"description":"Vanilla custard.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/af9db8c1-6c5f-4c73-ae9f-3d157d9b73de-retina-large.jpg","id":70980132,"name":"Bae-Sic Ice Cream"},{"price":1095,"description":"Almonds, chocolate, and marshmallows Ice Cream.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/a7c3bac8-5e44-4287-aaeb-dbec3d2aa8b3-retina-large.jpg","id":70980142,"name":"Rock n' Roll"},{"price":1095,"description":"Most popular. Thai tea. Ice Cream","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/af074363-fad4-4ef8-b3af-3dde4fbfb000-retina-large.jpg","id":70980144,"name":"Mai Thai"},{"price":1095,"description":"Avocado Ice Cream.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/3c7dfe81-0fd8-4a20-977f-21749c807df0-retina-large.jpg","id":70980136,"name":"Bravocado"},{"price":1095,"description":"Non-dairy and vegan Ice Cream.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/b8201f77-c164-4b5e-905d-899b10c2f902-retina-large.jpg","id":70980152,"name":"Strawberry Lemonade Sorbet Ice Cream"}]
         * is_catering : false
         * subtitle : All Day
         * id : 743527
         * name : Icicles (San Mateo) All Day 3/26
         */

        @SerializedName("is_catering")
        private boolean isCatering;
        @SerializedName("subtitle")
        private String subtitle;
        @SerializedName("id")
        private int id;
        @SerializedName("name")
        private String name;
        @SerializedName("popular_items")
        private List<PopularItemsBean> popularItems;

        public boolean isIsCatering() {
            return isCatering;
        }

        public void setIsCatering(boolean isCatering) {
            this.isCatering = isCatering;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<PopularItemsBean> getPopularItems() {
            return popularItems;
        }

        public void setPopularItems(List<PopularItemsBean> popularItems) {
            this.popularItems = popularItems;
        }

        public static class PopularItemsBean {
            /**
             * price : 1095
             * description : Most popular. Mint or regular oreos Ice Cream.
             * img_url : https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/4ffd4621-3b4d-4f42-b7bd-40a00c159b11-retina-large.jpg
             * id : 70980130
             * name : Oreo Blast
             */

            @SerializedName("price")
            private int price;
            @SerializedName("description")
            private String description;
            @SerializedName("img_url")
            private String imgUrl;
            @SerializedName("id")
            private int id;
            @SerializedName("name")
            private String name;

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
