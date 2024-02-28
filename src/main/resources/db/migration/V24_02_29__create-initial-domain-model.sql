CREATE TABLE app_user (
    id VARCHAR(38) NOT NULL,
    username VARCHAR(255) UNIQUE NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    insecure_password VARCHAR(255) NOT NULL,
    created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
);

CREATE TABLE portfolio (
    id VARCHAR(38) NOT NULL,
    user_id VARCHAR(38) NOT NULL,
    name VARCHAR(255) UNIQUE NOT NULL,
    created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES app_user(id),
    PRIMARY KEY (id)
);

CREATE TABLE investment (
    id VARCHAR(38) NOT NULL,
    portfolio_id VARCHAR(38) NOT NULL,
    asset_type VARCHAR(50) NOT NULL,
    asset_name VARCHAR(255) NOT NULL,
    quantity DECIMAL NOT NULL,
    FOREIGN KEY (portfolio_id) REFERENCES portfolio(id),
    PRIMARY KEY (id)
);

CREATE TABLE investment_order (
    id VARCHAR(38) NOT NULL,
    investment_id VARCHAR(38) NOT NULL,
    price_per_share DECIMAL NOT NULL,
    side VARCHAR(32) NOT NULL,
    executed_at TIMESTAMP WITH TIME ZONE,
    quantity DECIMAL NOT NULL,
    FOREIGN KEY (investment_id) REFERENCES investment(id),
    PRIMARY KEY (id)
);
