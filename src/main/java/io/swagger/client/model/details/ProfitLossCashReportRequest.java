package io.swagger.client.model.details;

import java.util.List;
import java.util.Objects;
/**
 * ProfitLossRequest
 */
public class ProfitLossCashRequest {
    private List<ReportFilters> filters = null;

    public ProfitLossCashRequest(List<ReportFilters> filters) {
        this.filters = filters;
    }

    public List<ReportFilters> getFilters() {
        return filters;
    }

    public void setFilters(List<ReportFilters> filters) {
        this.filters = filters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfitLossCashRequest that = (ProfitLossCashRequest) o;
        return Objects.equals(filters, that.filters);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(filters);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProfitLossCashRequest {\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        if (o instanceof List) {
            StringBuilder listString = new StringBuilder("[\n");
            for (Object item : (List<?>) o) {
                listString.append("        ").append(item.toString().replace("\n", "\n        ")).append(",\n");
            }
            listString.append("    ]");
            return listString.toString();
        }
        return o.toString().replace("\n", "\n    ");
    }
}
